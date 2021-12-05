package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.HoaDon;

/**
 *
 * @author huynh
 */
public class HoaDonDAO {

    public void Insert(HoaDon hoaDon) {
        String sql = "INSERT INTO HoaDon VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                hoaDon.getMaHopDong(),
                hoaDon.getTienPhong(),
                hoaDon.getNgayTao(),
                hoaDon.isTrangThai(),
                hoaDon.getThang(),
                hoaDon.getMaSV(),
                hoaDon.getHoTen(),
                hoaDon.getMaPhong()
        );
    }

    public void Update(HoaDon hoaDon) {
        String sql = "UPDATE HoaDon SET TongTien=? WHERE MaHoaDon=?";
        JDBCHelper.executeUpdate(sql,
                hoaDon.getMaHoaDon());
    }

    public void Delete(Integer id) {
        String sql = "DELETE FROM HoaDon WHERE MaHoaDon=?";
        JDBCHelper.executeUpdate(sql, id);
    }

    public List<HoaDon> select() {
        String sql = "SELECT * FROM HoaDon";
        return selectAll(sql);
    }
    public List<HoaDon> selectByMaSV(String keyword) {
        String sql = "SELECT * FROM HoaDon WHERE MaSV = ?";
        return selectAll(sql, keyword);
    }

    public HoaDon findById(Integer id) {
        String sql = "SELECT * FROM HoaDon WHERE MaHoaDon=?";
        List<HoaDon> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public HoaDon findByIdPhong(Integer id) {
        String sql = "SELECT * FROM HoaDon WHERE MaHoaDon=?";
        List<HoaDon> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<HoaDon> selectMaPhong(int keyword) {
        String sql = "SELECT MaPhong FROM HoaDon WHERE MaHoaDon = ?";
        return selectAll(sql, keyword);
    }

    private List<HoaDon> selectAll(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDon model = readFromResultSet(rs);
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

    private HoaDon readFromResultSet(ResultSet rs) throws SQLException {
        HoaDon hoaDon = new HoaDon();
        hoaDon.setMaHoaDon(rs.getInt("MaHoaDon"));
        hoaDon.setMaHopDong(rs.getInt("MaHopDong"));
        hoaDon.setTienPhong(rs.getDouble("TienPhong"));
        hoaDon.setNgayTao(rs.getDate("NgayTao"));
        hoaDon.setTrangThai(rs.getBoolean("TrangThai"));
        hoaDon.setThang(rs.getString("Thang"));
        hoaDon.setMaSV(rs.getString("MaSV"));
        hoaDon.setHoTen(rs.getString("HoTen"));
        hoaDon.setMaPhong(rs.getString("MaPhong"));
        return hoaDon;
    }
}
