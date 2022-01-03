package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {

    public List<Object[]> getDoanhThuTheoThang(boolean maPhong) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call thongKeThang (?)}";
                rs = JDBCHelper.executeQuery(sql, maPhong);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("Phong"),
                        rs.getString("Thang"),
                        rs.getDouble("DoanhThu")};
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
