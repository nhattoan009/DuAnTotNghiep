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

    public interface I_HoaDon {

        public void Insert(HoaDon hoaDon);

        public void Update(HoaDon hoaDon);

        public void Delete(Integer id);

        public List<HoaDon> select();

        public HoaDon findById(Integer id);

    }

    class HDon implements I_HoaDon {

        @Override
        public void Insert(HoaDon hoaDon) {
            String sql = "INSERT INTO HoaDon VALUES (?, ?, ?, ?)";
            JDBCHelper.executeUpdate(sql,
                    hoaDon.getMaHoaDon(),
                    hoaDon.getHopDong(),
                    hoaDon.getTongTien(),
                    hoaDon.getNgayTao());
        }

        @Override
        public void Update(HoaDon hoaDon) {
            String sql = "UPDATE HoaDon SET TongTien=? WHERE MaHoaDon=?";
            JDBCHelper.executeUpdate(sql,
                    hoaDon.getTongTien(),
                    hoaDon.getMaHoaDon());
        }

        @Override
        public void Delete(Integer id) {
            String sql = "DELETE FROM HoaDon WHERE MaHoaDon=?";
            JDBCHelper.executeUpdate(sql, id);
        }

        @Override
        public List<HoaDon> select() {
            String sql = "SELECT * FROM HoaDon";
            return selectAll(sql);
        }

        @Override
        public HoaDon findById(Integer id) {
            String sql = "SELECT * FROM HoaDon WHERE MaHoaDon=?";
            List<HoaDon> list = selectAll(sql, id);
            return list.size() > 0 ? list.get(0) : null;
        }

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
        hoaDon.setTongTien(rs.getFloat("TongTien"));
        hoaDon.setNgayTao(rs.getDate("NgayTao"));
        return hoaDon;
    }
}
