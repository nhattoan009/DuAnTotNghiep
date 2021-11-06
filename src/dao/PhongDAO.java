package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Phong;

/**
 *
 * @author huynh
 */
public class PhongDAO {

    public void Insert(Phong phong) {
        String sql = "INSERT INTO Phong VALUES (?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                phong.getMaPhong(),
                phong.getTenPhong(),
                phong.getGiaPhong(),
                phong.isTrangThai());
    }

    public void Update(Phong phong) {
        String sql = "UPDATE Phong SET TenPhong=?, GiaPhong=?, TrangThai=? WHERE MaPhong=?"; //where
        JDBCHelper.executeUpdate(sql,
                phong.getTenPhong(),
                phong.getGiaPhong(),
                phong.isTrangThai(),
                phong.getMaPhong());
    }

    public void Delete(String id) {
        String sql = "DELETE FROM Phong WHERE MaPhong=?";
        JDBCHelper.executeUpdate(sql, id);
    }

    public List<Phong> select() {
        String sql = "SELECT * FROM Phong";
        return selectAll(sql);
    }
    
    public List<Phong> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM Phong WHERE MaPhong LIKE ?";
        return selectAll(sql, "%" + keyword + "%");
    }

    public Phong findById(String id) {
        String sql = "SELECT * FROM Phong WHERE MaPhong=?";
        List<Phong> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<Phong> selectAll(String sql, Object... args) {
        List<Phong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Phong model = readFromResultSet(rs);
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

    private Phong readFromResultSet(ResultSet rs) throws SQLException {
        Phong phong = new Phong();
        phong.setMaPhong(rs.getString("MaPhong"));
        phong.setTenPhong(rs.getString("TenPhong"));
        phong.setGiaPhong(rs.getFloat("GiaPhong"));
        phong.setTrangThai(rs.getBoolean("TrangThai"));
        return phong;
    }
}
