package BaiTapAsm;

public abstract class NhanVien {
     protected String maNhanVien;
     protected String hoTen;
     protected double luongCoBan;

    public NhanVien(String maNhanVien, String hoTen, double luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
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


    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", luongCoBan=" + luongCoBan +
                '}';
    }
}

