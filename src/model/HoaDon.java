package model;

import java.util.Date;
import lombok.Data;

public @Data
class HoaDon {

    int maHoaDon;
    int maHopDong;
    String maSV;
    String hoTen;
    String maPhong;
    double tienPhong;
    Date ngayTao;
    boolean trangThai;
    String Thang;
    
}
