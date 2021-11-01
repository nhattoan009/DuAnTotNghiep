package model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author huynh
 */
public @Data
class HopDong {

    int maHopDong;
    String maSV;
    String maPhong;
    Date ngayTao;
    boolean trangThai;
    double giaThue;
    SinhVien sinhVien;
    Phong phong;
}
