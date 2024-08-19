package BaiTapAsm;

public class NhanVienTiepThi extends NhanVien{
    public double  doanhSo;
    public double hoaHong;

    public NhanVienTiepThi(String maNhanVien, String hoTen, double luongCoBan, double doanhSo, double hoaHong) {
        super(maNhanVien, hoTen, luongCoBan);
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



}
