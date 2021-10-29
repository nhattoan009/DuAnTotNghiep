package model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author huynh
 */
public @Data
class HoaDon {

    int maHoaDon;
    int maHopDong;
    float tongTien;
    Date ngayTao;
    HopDong hopDong;

}
