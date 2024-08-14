package org.javacore.CongTy;

public abstract class NhanVien {
    protected  String ten;
    protected  String que;
    protected int cccd;
    protected  double luongCoBan = 850;

    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }
    // trong class co phuong thuc truu tuong thi bat buoc class cung phai la class truu tuong
    // phuong thuc abs kh co dc co noi dung ham
    // lop abs la 1 lop truu tuong va khong the khoi tao bang toan tu new
    public abstract  double tinhLuong();
}
