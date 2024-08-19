package org.BaiTapAsm;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private double luongTrachNhiem;
    public TruongPhong(LoaiNhanVien loaiNv)
    {
        super(loaiNv);;
    }
    public TruongPhong(String maNhanVien, String hoTen, double luongCoBan,double luongTrachNhiem,String loaiNv) {
        super(maNhanVien, hoTen, luongCoBan,loaiNv);
        this.luongCoBan = luongCoBan;
        this.luongTrachNhiem = luongTrachNhiem;

        }
    @Override
    public double  tinhThuNhap(){
        return luongCoBan + luongTrachNhiem;

    }
    @Override
    public double tinhThue() {
        double thuNhap  = tinhThuNhap();
        if(thuNhap <= 9000000) return 0;
        if(thuNhap <= 15000000) return thuNhap * 0.1;
        return thuNhap * 0.12;
    }
    @Override
    public void nhapThongTinNhanVien(Scanner scanner) {
        System.out.println("Nhap luong trach nhiem");
        this.luongTrachNhiem = scanner.nextDouble();
        super.nhapThongTinNhanVien(scanner);
    }




}

