package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DichVu;

public class DichVuDAO {

    public void Insert(DichVu dichVu) {
        String sql = "INSERT INTO DichVu VALUES (?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                dichVu.getMaDV(),
                dichVu.getTenDV(),
                dichVu.getGiaDV());
    }

    public void Update(DichVu dichVu) {
        String sql = "UPDATE DichVu SET TenDV=?, GiaDV=? WHERE MaDV=?"; //where
        JDBCHelper.executeUpdate(sql,
                dichVu.getTenDV(),
                dichVu.getGiaDV(),
                dichVu.getMaDV());
    }

    public void Delete(String id) {
        String sql = "DELETE FROM DichVu WHERE MaDV=?";
        JDBCHelper.executeUpdate(sql, id);
    }

    public List<DichVu> select() {
        String sql = "SELECT * FROM DichVu";
        return selectAll(sql);
    }

    public List<DichVu> getGiaDien() {
        String sql = "SELECT GiaDV FROM DichVu WHERE MaDV = 'DIEN'";
        return selectAll(sql);
    }

    public DichVu findById(String id) {
        String sql = "SELECT * FROM DichVu WHERE MaDV=?";
        List<DichVu> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<DichVu> selectAll(String sql, Object... args) {
        List<DichVu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    DichVu model = readFromResultSet(rs);
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

    private DichVu readFromResultSet(ResultSet rs) throws SQLException {
        DichVu dichVu = new DichVu();
        dichVu.setMaDV(rs.getString("MaDV"));
        dichVu.setTenDV(rs.getString("TenDV"));
        dichVu.setGiaDV(rs.getBigDecimal("GiaDV"));
        return dichVu;
    }
}
