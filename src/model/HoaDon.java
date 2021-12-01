package model;

import java.util.Date;
import lombok.Data;

public @Data
class HoaDon {

    int maHoaDon;
    int maHopDong;
    double tienPhong;
    Date ngayTao;
    boolean trangThai;
}
