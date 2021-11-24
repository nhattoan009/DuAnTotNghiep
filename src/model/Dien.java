package model;

import lombok.Data;

public @Data
class Dien {

    int maDien;
    String maDV;
    String maPhong;
    int chiSoCu;
    int chiSoMoi;
    int suDung;
    double tongTien;
    String Thang;
    DichVu dichVu;
    Phong phong;
}
