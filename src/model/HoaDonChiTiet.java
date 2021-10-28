package model;

import java.util.Date;

/**
 *
 * @author huynh
 */
public class HoaDonChiTiet {

    int maHDCT;
    int maHoaDon;
    Date ngayTao;
    float tienDien;
    float tienNuoc;
    float tienPhong;
    float tongTien;
    HoaDon hoaDon;

    public HoaDonChiTiet(int maHDCT, int maHoaDon, Date ngayTao, float tienDien, float tienNuoc, float tienPhong, float tongTien, HoaDon hoaDon) {
        this.maHDCT = maHDCT;
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.tienDien = tienDien;
        this.tienNuoc = tienNuoc;
        this.tienPhong = tienPhong;
        this.tongTien = tongTien;
        this.hoaDon = hoaDon;
    }

    public HoaDonChiTiet() {
    }

    public int getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(int maHDCT) {
        this.maHDCT = maHDCT;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public float getTienDien() {
        return tienDien;
    }

    public void setTienDien(float tienDien) {
        this.tienDien = tienDien;
    }

    public float getTienNuoc() {
        return tienNuoc;
    }

    public void setTienNuoc(float tienNuoc) {
        this.tienNuoc = tienNuoc;
    }

    public float getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(float tienPhong) {
        this.tienPhong = tienPhong;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

}
