package Bll;

import dao.QuanLyDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author huynh
 */
public class Bll_DangNhap {

    public static String TenUser, MatKhau, quyen;

    public static boolean KT_DangNhap(String user, String pass) {

        ResultSet rs = QuanLyDAO.findById(user);
        try {
            if (rs.next()) {
                if (rs.getString("TenDangNhap").matches(user) && rs.getString("MatKhau").matches(pass)) {
                    System.out.println("Đăng nhập thành công");
                    TenUser = rs.getString("TenDangNhap");
                    MatKhau = rs.getString("MatKhau");
                }
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return false;
    }

    public static boolean KT_DoiMK(String mkcu, String mkmoi, String nhaplai) {
        if (!mkcu.equals(MatKhau)) {
//            thongbao.thongbao("Mật khẩu cũ sai", "");
            return false;
        }
        if (mkmoi.length() < 5) {
//            thongbao.thongbao("mật khẩu dài hơn 5 ký tự", "");
            return false;
        }
        if (!mkmoi.equals(nhaplai)) {
//            thongbao.thongbao("Nhập lại mật khẩu", "");
            return false;
        }
        return true;
    }
}
