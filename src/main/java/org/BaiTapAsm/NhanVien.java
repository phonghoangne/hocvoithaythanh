package org.BaiTapAsm;


import java.util.Scanner;

public abstract class NhanVien {
     protected String maNhanVien;
     protected String hoTen;
     protected double luongCoBan;

     protected LoaiNhanVien loaiNv;
     public NhanVien(LoaiNhanVien loaiNv)
     {
            this.loaiNv = loaiNv      ;
     }

    public NhanVien(String maNhanVien, String hoTen, double luongCoBan, String loaiNv) {
         this.loaiNv = LoaiNhanVien.valueOf(loaiNv);
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien() {

    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public abstract double tinhThuNhap();
    public abstract double tinhThue();
    public double getThuNhap(){
        return tinhThuNhap();
    }
    public double getThue(){
        return tinhThue();
    }


    public LoaiNhanVien getLoaiNv() {
        return loaiNv;
    }

    public void setLoaiNv(LoaiNhanVien loaiNv) {
        this.loaiNv = loaiNv;
    }

    public void nhapThongTinNhanVien(Scanner scanner)
    {
        System.out.println("ma nv: ");
        this.maNhanVien = scanner.nextLine();
        System.out.println("loai nv: ");
        this.loaiNv = LoaiNhanVien.valueOf(scanner.nextLine());
        System.out.println("ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.println("luong co ban: ");
        this.luongCoBan = scanner.nextDouble();

    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", luongCoBan=" + luongCoBan +
                '}';
    }
}

