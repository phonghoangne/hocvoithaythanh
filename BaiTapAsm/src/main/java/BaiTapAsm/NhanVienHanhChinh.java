package BaiTapAsm;

public class NhanVienHanhChinh extends NhanVien  {
    public NhanVienHanhChinh(String maNhanVien, String hoTen, double luongCoBan) {
        super(maNhanVien, hoTen, luongCoBan);
        this.luongCoBan = luongCoBan;
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
}
