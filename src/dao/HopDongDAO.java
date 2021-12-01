package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.HopDong;

/**
 *
 * @author huynh
 */
public class HopDongDAO {

    public void Insert(HopDong hopDong) {
        String sql = "INSERT INTO HopDong VALUES (?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                hopDong.getMaPhong(),
                hopDong.getMaSV(),
                hopDong.getNgayTao(),
                hopDong.isTrangThai(),
                hopDong.getGiaThue());
    }

    public void Update(HopDong hopDong) {
        String sql = "UPDATE HopDong SET TrangThai=?, GiaThue=? WHERE MaHopDong=?"; //where
        JDBCHelper.executeUpdate(sql,
                hopDong.isTrangThai(),
                hopDong.getGiaThue(),
                hopDong.getMaHopDong());
    }

//        @Override
//        public void Delete(Integer id) {
//            String sql = "DELETE FROM Phong WHERE MaPhong=?";
//            JDBCHelper.executeUpdate(sql, id);
//        }
    public List<HopDong> select() {
        String sql = "SELECT * FROM HopDong";
        return selectAll(sql);
    }

    public HopDong findById(int id) {
        String sql = "SELECT * FROM HopDong WHERE MaHopDong=?"; //MaPhong=?
        List<HopDong> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    public HopDong findByIdMaSV(String id) {
        String sql = "SELECT * FROM HopDong WHERE MaSV=?";
        List<HopDong> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public List<HopDong> selectByMaSV(String keyword) {
        String sql = "SELECT * FROM HopDong WHERE MaSV LIKE ? and TrangThai = 1";
        return selectAll(sql, "%" + keyword + "%");
    }
    public List<HopDong> selectByMaPhong(String keyword) {
        String sql = "SELECT * FROM HopDong WHERE MaPhong = ?";
        return selectAll(sql, keyword);
    }
    public List<HopDong> selectByTrangThai0() {
        String sql = "SELECT * FROM HopDong WHERE TrangThai = 0";
        return selectAll(sql);
    }
    public List<HopDong> selectByTrangThai1() {
        String sql = "SELECT * FROM HopDong WHERE TrangThai = 1";
        return selectAll(sql);
    }

    private List<HopDong> selectAll(String sql, Object... args) {
        List<HopDong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HopDong model = readFromResultSet(rs);
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

    private HopDong readFromResultSet(ResultSet rs) throws SQLException {
        HopDong hopDong = new HopDong();
        hopDong.setMaHopDong(rs.getInt("MaHopDong"));
        hopDong.setMaSV(rs.getString("MaSV"));
        hopDong.setMaPhong(rs.getString("MaPhong"));
        hopDong.setNgayTao(rs.getDate("NgayTao"));
        hopDong.setGiaThue(rs.getFloat("GiaThue"));
        hopDong.setTrangThai(rs.getBoolean("TrangThai"));
        return hopDong;
    }
}
