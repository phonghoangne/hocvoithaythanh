package org.javacore.CongTy;

public class test {
    public static void main(String[] args) {
//        NhanVien nv1 =  new NhanVien(" nhan vien 1", " BacNinh",123456);
//        double luongnv1 = nv1.tinhLuong();
//        System.out.println("Luong nhan vien 1 la : " + luongnv1);
        // Tao doi tuong la nv hanh chinh
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hanhchinh1","thainguyen", 33333);
        double luonghc1 = hc1.tinhLuong();
        System.out.println(luonghc1);
        // tao doi tuong nv di ca
//        NhanVienDiCa ca1 = new NhanVienDiCa("nguyenchithanh","tayninh",222222);
//        double luongca1 = ca1.tinhLuong();
//        System.out.println(luongca1);


    }
}
