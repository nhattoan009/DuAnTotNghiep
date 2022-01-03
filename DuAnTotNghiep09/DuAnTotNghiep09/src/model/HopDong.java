package model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

public @Data
class HopDong {

    int maHopDong;
    String maPhong;
    String maSV;
    String hoTen;
    Date ngayTao;
    String trangThai;
    BigDecimal giaThue;
    String Thang;
    String trangThaiThu;
}
