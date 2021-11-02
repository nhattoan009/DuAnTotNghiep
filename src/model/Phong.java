package model;

import lombok.Data;

/**
 *
 * @author huynh
 */
public @Data
class Phong {

    String maPhong;
    int maDienNuoc;
    String tenPhong;
    double giaPhong;
    boolean trangThai;
    DienNuoc dienNuoc;

}
