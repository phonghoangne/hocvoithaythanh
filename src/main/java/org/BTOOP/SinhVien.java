package org.BTOOP;

public abstract class SinhVien {
    private String mssv,tenSinhvien;
    int tuoi;

    public SinhVien(String mssv, String tenSinhvien, int tuoi) {
        this.mssv = mssv;
        this.tenSinhvien = tenSinhvien;
        this.tuoi = tuoi;
    }
    public abstract double tinhDTB();
    public SinhVien() {
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTenSinhvien() {
        return tenSinhvien;
    }

    public void setTenSinhvien(String tenSinhvien) {
        this.tenSinhvien = tenSinhvien;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "tuoi=" + tuoi +
                ", tenSinhvien='" + tenSinhvien + '\'' +
                ", mssv='" + mssv + '\'' +
                '}';
    }



}
