package org.javacore.CongTy;

public class NhanVienDiCa extends NhanVien {
    protected int ca;

    public NhanVienDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan*1.05; // cao hon 5% so voi nvhc
    }
}
