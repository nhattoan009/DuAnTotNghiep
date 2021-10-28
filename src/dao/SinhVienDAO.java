package dao;

import helper.DateHelper;
import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien;

/**
 *
 * @author huynh
 */
public class SinhVienDAO {

    interface I_SinhVien {

        public void Insert(SinhVien sinhVien);

        public void Update(SinhVien sinhVien);

        public void Delete(String id);

        public List<SinhVien> select();

        public SinhVien findById(String id);

    }

    class SV implements I_SinhVien {

        @Override
        public void Insert(SinhVien sinhVien) {
            String sql = "INSERT INTO SinhVien VALUES (?, ?, ?, ?, ?, ?, ?)";
            JDBCHelper.executeUpdate(sql,
                    sinhVien.getMaSV(),
                    sinhVien.getHoTen(),
                    sinhVien.isGioiTinh(),
                    DateHelper.toString(sinhVien.getNgaySinh()),
                    sinhVien.getSDT(),
                    sinhVien.getCMND(),
                    sinhVien.getEmail());
        }

        @Override
        public void Update(SinhVien sinhVien) {
            String sql = "UPDATE SinhVien SET HoTen=?, GioiTinh=?, NgaySinh=?, SDT=?, CMND=?, Email=? WHERE MaSV=?";
            JDBCHelper.executeUpdate(sql,
                    sinhVien.getHoTen(),
                    sinhVien.isGioiTinh(),
                    DateHelper.toString(sinhVien.getNgaySinh()),
                    sinhVien.getSDT(),
                    sinhVien.getCMND(),
                    sinhVien.getEmail(),
                    sinhVien.getMaSV());
        }

        @Override
        public void Delete(String id) {
            String sql = "DELETE FROM SinhVien WHERE MaSV=?";
            JDBCHelper.executeUpdate(sql, id);
        }

        @Override
        public List<SinhVien> select() {
            String sql = "SELECT * FROM SinhVien";
            return selectAll(sql);
        }

        @Override
        public SinhVien findById(String id) {
            String sql = "SELECT * FROM SinhVien WHERE MaSV=?";
            List<SinhVien> list = selectAll(sql, id);
            return list.size() > 0 ? list.get(0) : null;
        }

    }

    private List<SinhVien> selectAll(String sql, Object... args) {
        List<SinhVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    SinhVien model = readFromResultSet(rs);
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

    private SinhVien readFromResultSet(ResultSet rs) throws SQLException {
        SinhVien sinhVien = new SinhVien();
        sinhVien.setMaSV(rs.getString("MaSV"));
        sinhVien.setHoTen(rs.getString("HoTen"));
        sinhVien.setGioiTinh(rs.getBoolean("GioiTinh"));
        sinhVien.setNgaySinh(rs.getDate("NgaySinh"));
        sinhVien.setSDT(rs.getString("SDT"));
        sinhVien.setCMND(rs.getString("CMND"));
        sinhVien.setEmail(rs.getString("Email"));
        return sinhVien;
    }
}
