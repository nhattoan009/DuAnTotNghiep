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
        String sql = "INSERT INTO HopDong VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                hopDong.getMaPhong(),
                hopDong.getMaSV(),
                hopDong.getNgayTao(),
                hopDong.getTrangThai(),
                hopDong.getGiaThue(),
                hopDong.getThang(),
                hopDong.getTrangThaiThu(),
                hopDong.getHoTen());
    }

    public void Update(HopDong hopDong) {
        String sql = "UPDATE HopDong SET MaPhong=?, TrangThai=?, GiaThue=?, Thang=?, TrangThaiThu=? WHERE MaHopDong=?"; //where
        JDBCHelper.executeUpdate(sql,
                hopDong.getMaPhong(),
                hopDong.getTrangThai(),
                hopDong.getGiaThue(),
                hopDong.getThang(),
                hopDong.getTrangThaiThu(),
                hopDong.getMaHopDong());
    }

//        @Override
//        public void Delete(Integer id) {
//            String sql = "DELETE FROM Phong WHERE MaPhong=?";
//            JDBCHelper.executeUpdate(sql, id);
//        }
    public List<HopDong> select() {
        String sql = "SELECT * FROM HopDong WHERE TrangThai=N'hoạt động' order by MaPhong";
        return selectAll(sql);
    }

    public HopDong findById(int id) {
        String sql = "SELECT * FROM HopDong WHERE MaHopDong=?"; //MaPhong=?
        List<HopDong> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public void UpdateStatus(int maHopDong) {
        String sql = "UPDATE HopDong SET TrangThaiThu='Đã thu' WHERE MaHopDong=?"; //where
        JDBCHelper.executeUpdate(sql, maHopDong);
    }
    public void UpdateStatus2(int maHopDong) {
        String sql = "UPDATE HopDong SET TrangThaiThu='Chưa thu' WHERE MaHopDong=?"; //where
        JDBCHelper.executeUpdate(sql, maHopDong);
    }
    
    public HopDong findByIdMaSV(String id) {
        String sql = "SELECT * FROM HopDong WHERE MaSV=?";
        List<HopDong> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    public HopDong findByIdMaSVPhong(String maSV, String maPhong) {
        String sql = "SELECT * FROM HopDong WHERE MaSV=? and MaPhong=?";
        List<HopDong> list = selectAll(sql, maSV, maPhong);
        return list.size() > 0 ? list.get(0) : null;
    }

    public HopDong findByIdMaP(String id) {
        String sql = "SELECT * FROM HopDong WHERE MaPhong=?";
        List<HopDong> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
     public HopDong findByIdMaHoaDon(String id) {
        String sql = "SELECT * FROM HopDong WHERE MaHoaDon=?";
        List<HopDong> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<HopDong> selectByMaPhongAndTT(String maPhong, String tt) {
        String sql = "SELECT * FROM HopDong WHERE MaPhong = ? and TrangThai = ? order by MaPhong";
        return selectAll(sql, maPhong, tt);
    }

    public List<HopDong> selectByMaSV(String keyword) {
        String sql = "SELECT * FROM HopDong WHERE MaSV = ?";
        return selectAll(sql, keyword);
    }

    public List<HopDong> selectByMaPhongAndThang(String maPhong, String Thang) {
        String sql = "SELECT * FROM HopDong WHERE MaPhong = ? and Thang = ? order by MaPhong";
        return selectAll(sql, maPhong, Thang);
    }

    public List<HopDong> selectByMaPhong(String keyword) {
        String sql = "SELECT * FROM HopDong WHERE MaPhong = ?";
        return selectAll(sql, keyword);
    }

    public List<HopDong> selectByTrangThai0() {
        String sql = "SELECT * FROM HopDong WHERE TrangThai = 'Hoạt động'";
        return selectAll(sql);
    }

    public List<HopDong> selectByTrangThai1() {
        String sql = "SELECT * FROM HopDong WHERE TrangThai = 'Không hoạt động'";
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
        hopDong.setMaPhong(rs.getString("MaPhong"));
        hopDong.setMaSV(rs.getString("MaSV"));
        hopDong.setNgayTao(rs.getDate("NgayTao"));
        hopDong.setGiaThue(rs.getBigDecimal("GiaThue"));
        hopDong.setTrangThai(rs.getString("TrangThai"));
        hopDong.setThang(rs.getString("Thang"));
        hopDong.setTrangThaiThu(rs.getString("TrangThaiThu"));
        hopDong.setHoTen(rs.getString("HoTen"));
        return hopDong;
    }
}
