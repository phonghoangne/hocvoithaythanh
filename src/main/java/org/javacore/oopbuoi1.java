package org.javacore;

public class oopbuoi1 {
    public static void main(String[] args) {
        // khoi tao doi tuong thucp class sinh vien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("teo");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien(9.5, "Ti");
        sv4.hienThiThongTin();
        // neu ben class sinhvien de public thi co the truy cap dc .
       // sv4.hoTen = "obama";
//        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        // thay doio ten cua sinh vien4
        sv4.setHoTen("Black");
        sv4.setDiem(25);
        sv4.hienThiThongTin();
        // test phuong thuc co kieu tra ve
        double dtbsv4 = sv4.tinhDTB(1.5,7.2);
        System.out.println(dtbsv4);
        // test phuong thuc toString
        System.out.println(sv4);
        //Support Method vva Service Methhod
        sv4.checkHopLeDiem();
    }
}
