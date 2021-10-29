package dao;

import helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.QuanLy;

/**
 *
 * @author huynh
 */
public class QuanLyDAO {

    interface I_QuanLy {

        public void Insert(QuanLy quanLy);

        public void Update(QuanLy quanLy);

        public void Delete(String id);

        public List<QuanLy> select();

        public QuanLy findById(String id);

    }

    class QL implements I_QuanLy {

        @Override
        public void Insert(QuanLy quanLy) {
            String sql = "INSERT INTO QuanLy VALUES (?, ?)";
            JDBCHelper.executeUpdate(sql,
                    quanLy.getTenDangNhap(),
                    quanLy.getMatKhau());
        }

        @Override
        public void Update(QuanLy quanLy) {
            String sql = "UPDATE SinhVien SET TenDangNhap=?, MatKhau=?"; //where
            JDBCHelper.executeUpdate(sql,
                    quanLy.getTenDangNhap(),
                    quanLy.getMatKhau());
        }

        @Override
        public void Delete(String id) {
            String sql = "DELETE FROM QuanLy WHERE TenDangNhap=?";
            JDBCHelper.executeUpdate(sql, id);
        }

        @Override
        public List<QuanLy> select() {
            String sql = "SELECT * FROM QuanLy";
            return selectAll(sql);
        }

        @Override
        public QuanLy findById(String id) {
            String sql = "SELECT * FROM QuanLy WHERE MaSV=?";
            List<QuanLy> list = selectAll(sql, id);
            return list.size() > 0 ? list.get(0) : null;
        }

    }

    private List<QuanLy> selectAll(String sql, Object... args) {
        List<QuanLy> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    QuanLy model = readFromResultSet(rs);
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

    private QuanLy readFromResultSet(ResultSet rs) throws SQLException {
        QuanLy quanLy = new QuanLy();
        quanLy.setTenDangNhap(rs.getString("TenDangNhap"));
        quanLy.setMatKhau(rs.getString("MatKhau"));
        return quanLy;
    }
}
