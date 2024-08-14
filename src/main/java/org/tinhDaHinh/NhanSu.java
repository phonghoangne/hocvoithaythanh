package org.tinhDaHinh;

public  abstract class NhanSu {
    // them cac thuoc tinh
    private String ten ;
    private String cccd ;
    private String que ;
    // tao constructor

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public NhanSu(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    public NhanSu() {
    }

    // phuong thuc tinh luong
    public abstract double tinhLuong(int ngayCong);

}
