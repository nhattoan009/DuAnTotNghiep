package model;

import java.util.Date;
import lombok.Data;

public @Data
class HoaDon {

    int maHoaDon;
    int maHopDong;
    float tienDien;
    float tienNuoc;
    float tienPhong;
    float tongTien;
    Date ngayTao;
    HopDong hopDong;

}
