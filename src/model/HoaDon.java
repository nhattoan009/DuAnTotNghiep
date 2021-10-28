package model;

import java.util.Date;

/**
 *
 * @author huynh
 */
public class HoaDon {

    int maHoaDon;
    int maHopDong;
    float tongTien;
    Date ngayTao;
    HopDong hopDong;

    public HoaDon(int maHoaDon, int maHopDong, float tongTien, Date ngayTao, HopDong hopDong) {
        this.maHoaDon = maHoaDon;
        this.maHopDong = maHopDong;
        this.tongTien = tongTien;
        this.ngayTao = ngayTao;
        this.hopDong = hopDong;
    }

    public HoaDon() {
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }

}
