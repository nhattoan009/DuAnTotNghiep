package model;

import lombok.Data;

/**
 *
 * @author huynh
 */
public @Data
class DienNuoc {

    int maDienNuoc;
    String maPhong;
    String maDV;
    int chiSoDienCu;
    int chiSoNuocCu;
    int chiSoDienMoi;
    int chiSoNuocMoi;
    Phong phong;
    DichVu dichVu;
}
