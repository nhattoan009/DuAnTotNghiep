package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Nuoc;

public class NuocDAO {

    public void Insert(Nuoc nuoc) {
        String sql = "INSERT INTO Nuoc VALUES (?, ?, ?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                nuoc.getMaDV(),
                nuoc.getMaPhong(),
                nuoc.getChiSoCu(),
                nuoc.getChiSoMoi(),
                nuoc.getSuDung(),
                nuoc.getTongTien(),
                nuoc.getThang()
        );
    }

    public void Update(Nuoc nuoc) {
        String sql = "UPDATE Nuoc SET ChiSoCu=?,ChiSoMoi=? WHERE MaNuoc=?"; //where
        JDBCHelper.executeUpdate(sql,
                nuoc.getChiSoCu(),
                nuoc.getChiSoMoi(),
                nuoc.getMaNuoc());
    }

    public List<Nuoc> select() {
        String sql = "SELECT * FROM Nuoc";
        return selectAll(sql);
    }

    private List<Nuoc> selectAll(String sql, Object... args) {
        List<Nuoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Nuoc model = readFromResultSet(rs);
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

    private Nuoc readFromResultSet(ResultSet rs) throws SQLException {
        Nuoc nuoc = new Nuoc();
        nuoc.setMaNuoc(rs.getInt("MaNuoc"));
        nuoc.setMaDV(rs.getString("MaDV"));
        nuoc.setMaPhong(rs.getString("MaPhong"));
        nuoc.setChiSoCu(rs.getInt("ChiSoCu"));
        nuoc.setChiSoMoi(rs.getInt("ChiSoMoi"));
        nuoc.setSuDung(rs.getInt("SuDung"));
        nuoc.setTongTien(rs.getDouble("TongTien"));
        nuoc.setThang(rs.getString("Thang"));
        return nuoc;
    }
}
