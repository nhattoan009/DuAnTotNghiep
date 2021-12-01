package model;

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
    double tongTienDien;
    double tongTienNuoc;
    String Thang;
    boolean trangThai;
}
