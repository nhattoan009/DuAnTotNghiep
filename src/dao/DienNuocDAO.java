package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DienNuoc;

/**
 *
 * @author huynh
 */
public class DienNuocDAO {

    public void Insert(DienNuoc dien) {
        String sql = "INSERT INTO DienNuoc VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                dien.getMaDV(),
                dien.getMaPhong(),
                dien.getChiSoCuDien(),
                dien.getChiSoMoiDien(),
                dien.getChiSoCuNuoc(),
                dien.getChiSoMoiNuoc(),
                dien.getSuDungDien(),
                dien.getSuDungNuoc(),
                dien.getTongTienDien(),
                dien.getTongTienNuoc(),
                dien.getThang(),
                dien.getTrangThai()
        );
    }

    public void UpdateStatus(int maDN) {
        String sql = "UPDATE DienNuoc SET TrangThai='Đã thu' WHERE MaDienNuoc=?"; //where
        JDBCHelper.executeUpdate(sql, maDN);
    }

    public List<DienNuoc> select() {
        String sql = "SELECT * FROM DienNuoc";
        return selectAll(sql);
    }

    public DienNuoc findById(String id) {
        String sql = "SELECT * FROM DienNuoc WHERE MaDienNuoc = ?";
        List<DienNuoc> list = selectAll(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<DienNuoc> selectSCMDien(String maPhong, String Thang) {
        String sql = "SELECT * FROM DienNuoc WHERE MaPhong = ? and Thang = ? order by MaPhong";
        return selectAll(sql, maPhong, Thang);
    }
    
    public List<DienNuoc> selectDienNuocByMaDN(int id) {
        String sql = "SELECT * FROM DienNuoc WHERE MaDienNuoc = ?";
        return selectAll(sql, id);
    }
    
    public List<DienNuoc> selectSCMDienThang(String keyword) {
        String sql = "SELECT * FROM DienNuoc WHERE Thang = ?";
        return selectAll(sql,keyword);
    }
    public List<DienNuoc> selectByMaPhong(String keyword) {
        String sql = "SELECT * FROM DienNuoc WHERE MaPhong = ?";
        return selectAll(sql,keyword);
    }

    private List<DienNuoc> selectAll(String sql, Object... args) {
        List<DienNuoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    DienNuoc model = readFromResultSet(rs);
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

    private DienNuoc readFromResultSet(ResultSet rs) throws SQLException {
        DienNuoc dien = new DienNuoc();
        dien.setMaDienNuoc(rs.getInt("MaDienNuoc"));
        dien.setMaDV(rs.getString("MaDV"));
        dien.setMaPhong(rs.getString("MaPhong"));
        dien.setChiSoCuDien(rs.getInt("ChiSoCuDien"));
        dien.setChiSoMoiDien(rs.getInt("ChiSoMoiDien"));
        dien.setChiSoCuNuoc(rs.getInt("ChiSoCuNuoc"));
        dien.setChiSoMoiNuoc(rs.getInt("ChiSoMoiNuoc"));
        dien.setSuDungDien(rs.getInt("SuDungDien"));
        dien.setSuDungNuoc(rs.getInt("SuDungNuoc"));
        dien.setTongTienDien(rs.getBigDecimal("TongTienDien"));
        dien.setTongTienNuoc(rs.getBigDecimal("TongTienNuoc"));
        dien.setThang(rs.getString("Thang"));
        dien.setTrangThai(rs.getString("TrangThai"));
        return dien;
    }
}
