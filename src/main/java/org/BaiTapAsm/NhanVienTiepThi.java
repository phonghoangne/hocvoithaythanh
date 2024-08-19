package org.BaiTapAsm;

import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien{
    public double  doanhSo;
    public double hoaHong;
    public NhanVienTiepThi(LoaiNhanVien loaiNv)
    {
        super(loaiNv);;
    }
    public NhanVienTiepThi(String maNhanVien, String hoTen, double luongCoBan, double doanhSo, double hoaHong,String loaiNv) {
        super(maNhanVien, hoTen, luongCoBan,loaiNv);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }
    public double tinhThuNhap(){
        return luongCoBan + doanhSo + hoaHong;
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
        System.out.println("Nhap doanh so");
        this.doanhSo = scanner.nextDouble();
        this.hoaHong = scanner.nextDouble();
        super.nhapThongTinNhanVien(scanner);
    }

}
