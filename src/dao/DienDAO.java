package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Dien;

/**
 *
 * @author huynh
 */
public class DienDAO {

    public void Insert(Dien dien) {
        String sql = "INSERT INTO Dien VALUES (?, ?, ?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                dien.getMaDV(),
                dien.getMaPhong(),
                dien.getChiSoCu(),
                dien.getChiSoMoi(),
                dien.getSuDung(),
                dien.getTongTien(),
                dien.getThang()
        );
    }

    public void Update(Dien dienNuoc) {
        String sql = "UPDATE Dien SET ChiSoCu=?,ChiSoMoi=? WHERE MaDien=?"; //where
        JDBCHelper.executeUpdate(sql,
                dienNuoc.getChiSoCu(),
                dienNuoc.getChiSoMoi(),
                dienNuoc.getMaDien());
    }

    public List<Dien> select() {
        String sql = "SELECT * FROM Dien";
        return selectAll(sql);
    }
    
    public Dien findById(String id) {
        String sql = "SELECT * FROM Dien WHERE MaDien = ?";
        List<Dien> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<Dien> selectAll(String sql, Object... args) {
        List<Dien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Dien model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private Dien readFromResultSet(ResultSet rs) throws SQLException {
        Dien dien = new Dien();
        dien.setMaDien(rs.getInt("MaDien"));
        dien.setMaDV(rs.getString("MaDV"));
        dien.setMaPhong(rs.getString("MaPhong"));
        dien.setChiSoCu(rs.getInt("ChiSoCu"));
        dien.setChiSoMoi(rs.getInt("ChiSoMoi"));
        dien.setSuDung(rs.getInt("SuDung"));
        dien.setTongTien(rs.getDouble("TongTien"));
        dien.setThang(rs.getString("Thang"));
        return dien;
    }
}
