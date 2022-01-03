package model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

public @Data
class HoaDon {

    int maHoaDon;
    int maHopDong;
    String maSV;
    String hoTen;
    String maPhong;
    BigDecimal tienPhong;
    Date ngayTao;
    String trangThai;
    String Thang;
    
}
