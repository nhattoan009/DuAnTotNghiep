package model;

import java.util.Date;
import lombok.Data;

public @Data
class HoaDon {

    int maHoaDon;
    int maHopDong;
    double tienDien;
    double tienNuoc;
    double tienPhong;
    double tongTien;
    Date ngayTao;
    boolean trangThai;
    HopDong hopDong;
}
