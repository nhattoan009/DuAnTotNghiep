package model;

import java.util.Date;
import lombok.Data;

public @Data
class HopDong {

    int maHopDong;
    String maPhong;
    String maSV;
    String hoTen;
    Date ngayTao;
    boolean trangThai;
    double giaThue;
    String Thang;
    boolean trangThaiThu;
}
