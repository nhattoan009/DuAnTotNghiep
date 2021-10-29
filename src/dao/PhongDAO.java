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

    public interface I_Phong {

        public void Insert(Phong phong);

        public void Update(Phong phong);

        public void Delete(String id);

        public List<Phong> select();

        public Phong findById(String id);

    }

    class PH implements I_Phong {

        @Override
        public void Insert(Phong phong) {
            String sql = "INSERT INTO Phong VALUES (?, ?, ?, ?, ?)";
            JDBCHelper.executeUpdate(sql,
                    phong.getMaPhong(),
                    phong.getMaDienNuoc(),
                    phong.getTenPhong(),
                    phong.getGiaPhong(),
                    phong.isTrangThai());
        }

        @Override
        public void Update(Phong phong) {
            String sql = "UPDATE Phong SET MaPhong=?,MaDienNuoc=?, TenPhong=?, GiaPhong=?, TrangThai=? WHERE MaPhong=?"; //where
            JDBCHelper.executeUpdate(sql,
                    phong.getMaDienNuoc(),
                    phong.getTenPhong(),
                    phong.getGiaPhong(),
                    phong.isTrangThai(),
                    phong.getMaPhong());
        }

        @Override
        public void Delete(String id) {
            String sql = "DELETE FROM Phong WHERE MaPhong=?";
            JDBCHelper.executeUpdate(sql, id);
        }

        @Override
        public List<Phong> select() {
            String sql = "SELECT * FROM Phong";
            return selectAll(sql);
        }

        @Override
        public Phong findById(String id) {
            String sql = "SELECT * FROM Phong WHERE MaPhong=?";
            List<Phong> list = selectAll(sql, id);
            return list.size() > 0 ? list.get(0) : null;
        }

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
        phong.setMaDienNuoc(rs.getInt("MaDienNuoc"));
        phong.setTenPhong(rs.getString("TenPhong"));
        phong.setGiaPhong(rs.getFloat("GiaPhong"));
        phong.setTrangThai(rs.getBoolean("TrangThai"));
        return phong;
    }
}
