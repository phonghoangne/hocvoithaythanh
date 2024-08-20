package org.BaiTapAsm;

import java.util.Scanner;

public class NhanVienHanhChinh extends NhanVien  {
    public NhanVienHanhChinh(String maNhanVien, String hoTen, double luongCoBan,String loaiNv) {
        super(maNhanVien, hoTen, luongCoBan,loaiNv);
        this.luongCoBan = luongCoBan;
    }

    public NhanVienHanhChinh(LoaiNhanVien loaiNv)
    {
        super(loaiNv);;
    }
    @Override
    public double tinhThuNhap(){
        return luongCoBan;
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
        super.nhapThongTinNhanVien(scanner);
    }
}
