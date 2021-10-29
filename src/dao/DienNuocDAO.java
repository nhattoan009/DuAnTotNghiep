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

    public void Insert(DienNuoc dienNuoc) {
        String sql = "INSERT INTO DienNuoc VALUES (?, ?, ?, ?)";
        JDBCHelper.executeUpdate(sql,
                dienNuoc.getChiSoDienCu(),
                dienNuoc.getChiSoNuocCu(),
                dienNuoc.getGiaDien(),
                dienNuoc.getGiaNuoc());
    }

    public void Update(DienNuoc dienNuoc) {
        String sql = "UPDATE DienNuoc SET ChiSoDienCu=?, ChiSoNuocCu=?,giaDien=?,giaNuoc=? WHERE MaDienNuoc=?"; //where
        JDBCHelper.executeUpdate(sql,
                dienNuoc.getChiSoDienCu(),
                dienNuoc.getChiSoNuocCu(),
                dienNuoc.getGiaDien(),
                dienNuoc.getGiaNuoc());
    }

    public List<DienNuoc> select() {
        String sql = "SELECT * FROM DienNuoc";
        return selectAll(sql);
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
        DienNuoc dienNuoc = new DienNuoc();
        dienNuoc.setChiSoDienCu(rs.getInt("ChiSoDienCu"));
        dienNuoc.setChiSoNuocCu(rs.getInt("ChiSoDienMoi"));
        dienNuoc.setGiaDien(rs.getFloat("GiaDien"));
        dienNuoc.setGiaNuoc(rs.getFloat("GiaNuoc"));
        return dienNuoc;
    }
}
