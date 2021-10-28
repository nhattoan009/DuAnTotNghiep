package model;

/**
 *
 * @author huynh
 */
public class Phong {

    String maPhong;
    int maDienNuoc;
    String tenPhong;
    float giaPhong;
    boolean trangThai;
    DienNuoc dienNuoc;

    public Phong(String maPhong, int maDienNuoc, String tenPhong, float giaPhong, boolean trangThai, DienNuoc dienNuoc) {
        this.maPhong = maPhong;
        this.maDienNuoc = maDienNuoc;
        this.tenPhong = tenPhong;
        this.giaPhong = giaPhong;
        this.trangThai = trangThai;
        this.dienNuoc = dienNuoc;
    }

    public Phong() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getMaDienNuoc() {
        return maDienNuoc;
    }

    public void setMaDienNuoc(int maDienNuoc) {
        this.maDienNuoc = maDienNuoc;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public DienNuoc getDienNuoc() {
        return dienNuoc;
    }

    public void setDienNuoc(DienNuoc dienNuoc) {
        this.dienNuoc = dienNuoc;
    }

}
