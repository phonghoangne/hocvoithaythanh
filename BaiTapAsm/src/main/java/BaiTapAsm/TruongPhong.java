package BaiTapAsm;

public class TruongPhong extends NhanVien{
    private double luongTrachNhiem;
    public TruongPhong(String maNhanVien, String hoTen, double luongCoBan,double luongTrachNhiem) {
        super(maNhanVien, hoTen, luongCoBan);
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





}

