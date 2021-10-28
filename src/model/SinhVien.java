package model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author huynh
 */
public @Data
class SinhVien {

    String MaSV;
    String hoTen;
    String SDT;
    String CMND;
    String Email;
    boolean gioiTinh;
    Date ngaySinh;
}
