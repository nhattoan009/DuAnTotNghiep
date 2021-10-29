package model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author huynh
 */
public @Data
class HoaDonChiTiet {

    int maHDCT;
    int maHoaDon;
    Date ngayTao;
    float tienDien;
    float tienNuoc;
    float tienPhong;
    float tongTien;
    HoaDon hoaDon;

}
