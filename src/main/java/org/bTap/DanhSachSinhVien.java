package org.bTap;


import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;
// cach khai bao 1 array list
    public DanhSachSinhVien() {
        this.danhSach =new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    // them vao cuoi danh sach
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    public void inDanhSachSinhVien(){
       for(SinhVien sinhVien : danhSach){
           System.out.println(sinhVien);
       }
        }
    // kiem tra danh sach co rong hay khong
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
    // lay ra so luong sinh vien trong dnah sach
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }
    // lam rong danh sach sinh vien
    public void lamRongDanhSachSinhVien(){
        this.danhSach.removeAll(danhSach);
    }


}
