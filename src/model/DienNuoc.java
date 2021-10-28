package model;

/**
 *
 * @author huynh
 */
public class DienNuoc {

    int maDienNuoc;
    int chiSoDienCu;
    int chiSoNuocCu;
    float giaDien, giaNuoc;

    public DienNuoc(int maDienNuoc, int chiSoDienCu, int chiSoNuocCu, float giaDien, float giaNuoc) {
        this.maDienNuoc = maDienNuoc;
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoNuocCu = chiSoNuocCu;
        this.giaDien = giaDien;
        this.giaNuoc = giaNuoc;
    }

    public DienNuoc() {
    }

    public int getMaDienNuoc() {
        return maDienNuoc;
    }

    public void setMaDienNuoc(int maDienNuoc) {
        this.maDienNuoc = maDienNuoc;
    }

    public int getChiSoDienCu() {
        return chiSoDienCu;
    }

    public void setChiSoDienCu(int chiSoDienCu) {
        this.chiSoDienCu = chiSoDienCu;
    }

    public int getChiSoNuocCu() {
        return chiSoNuocCu;
    }

    public void setChiSoNuocCu(int chiSoNuocCu) {
        this.chiSoNuocCu = chiSoNuocCu;
    }

    public float getGiaDien() {
        return giaDien;
    }

    public void setGiaDien(float giaDien) {
        this.giaDien = giaDien;
    }

    public float getGiaNuoc() {
        return giaNuoc;
    }

    public void setGiaNuoc(float giaNuoc) {
        this.giaNuoc = giaNuoc;
    }

}
