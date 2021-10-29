package dao;

import connect.connection;
import helper.JDBCHelper;
import java.sql.ResultSet;
import model.QuanLy;

/**
 *
 * @author huynh
 */
public class QuanLyDAO {

    public void Insert(QuanLy quanLy) {
        String sql = "INSERT INTO QuanLy VALUES (?, ?)";
        JDBCHelper.executeUpdate(sql,
                quanLy.getTenDangNhap(),
                quanLy.getMatKhau());
    }

    public void Update(QuanLy quanLy) {
        String sql = "UPDATE SinhVien SET TenDangNhap=?, MatKhau=?"; //where
        JDBCHelper.executeUpdate(sql,
                quanLy.getTenDangNhap(),
                quanLy.getMatKhau());
    }

    public void Delete(String id) {
        String sql = "DELETE FROM QuanLy WHERE TenDangNhap=?";
        JDBCHelper.executeUpdate(sql, id);
    }

    public static ResultSet select() {
        String sql = "SELECT * FROM QuanLy";
        return connection.Getdata(sql);
    }

    public static ResultSet findById(String id) {
        String sql = "SELECT * FROM QuanLy WHERE TenDangNhap='" + id + "'";
        return connection.Getdata(sql);
    }
}
