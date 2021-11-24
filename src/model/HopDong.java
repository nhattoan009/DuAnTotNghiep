package model;

import java.util.Date;
import lombok.Data;

public @Data
class HopDong {

    int maHopDong;
    String maPhong;
    String maSV;
    Date ngayTao;
    boolean trangThai;
    double giaThue;
    Phong phong;
    SinhVien sinhVien;
}
