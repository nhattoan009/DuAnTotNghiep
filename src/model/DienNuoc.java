package model;

import java.math.BigDecimal;
import lombok.Data;

public @Data
class DienNuoc {

    int maDienNuoc;
    String maDV;
    String maPhong;
    int chiSoCuDien;
    int chiSoMoiDien;
    int chiSoCuNuoc;
    int chiSoMoiNuoc;
    int suDungDien;
    int suDungNuoc;
    BigDecimal tongTienDien;
    BigDecimal tongTienNuoc;
    String Thang;
    String trangThai;
}
