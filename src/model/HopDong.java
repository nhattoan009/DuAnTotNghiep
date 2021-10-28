package model;

import java.util.Date;

/**
 *
 * @author huynh
 */
public class HopDong {

    int maHopDong;
    String maSV;
    String maPhong;
    Date ngayTao;
    boolean trangThai;
    float giaThue;
    SinhVien sinhVien;
    Phong phong;

    public HopDong(int maHopDong, String maSV, String maPhong, Date ngayTao, boolean trangThai, float giaThue, SinhVien sinhVien, Phong phong) {
        this.maHopDong = maHopDong;
        this.maSV = maSV;
        this.maPhong = maPhong;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.giaThue = giaThue;
        this.sinhVien = sinhVien;
        this.phong = phong;
    }

    public HopDong() {
    }

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public float getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(float giaThue) {
        this.giaThue = giaThue;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

}
