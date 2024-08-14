package org.javacore;
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) {

        SinhVienTuNhien svXh = new SinhVienTuNhien("msv2", "Nguyen Van Hung", 22, 8.0, 7.5, 9.0, 8.5, 8.0);
        SinhVienXaHoi svTn = new SinhVienXaHoi("msv3", "Hoang Van Phong", 23, 7.5, 6.5, 8.0, 7.0, 6.0);
        System.out.println(svXh);
        System.out.println("DTB: " + svXh.tinhDTB());

        System.out.println();

        System.out.println(svTn);
        System.out.println("DTB: " + svTn.tinhDTB());
        List<SinhVien> danhSachSinhVien = new ArrayList<>();
        List<SinhVien> sinhVienDTBTren5 = new ArrayList<>();
        List<SinhVien> sinhVienDTBDuoi5 = new ArrayList<>();

        danhSachSinhVien.add(new SinhVienTuNhien("SV1", "nguyen chi thanh", 20, 8.0, 7.5, 9.0, 8.5, 8.0));
        danhSachSinhVien.add(new SinhVienXaHoi("SV2", "nguyen duc loc", 21, 9.0, 7.0, 8.5, 9.0, 8.0));
        danhSachSinhVien.add(new SinhVienTuNhien("SV3", "hoang van cam", 22, 4.5, 6.0, 5.0, 4.0, 1));
        danhSachSinhVien.add(new SinhVienXaHoi("SV", "le my duyen", 20, 6.0, 5.0, 4.5, 1, 2));
        for(SinhVien sv : danhSachSinhVien) {
            if(sv.tinhDTB() >= 5) {
                sinhVienDTBTren5.add(sv);
            }else {
                sinhVienDTBDuoi5.add(sv);}
            }

        System.out.println("danh sach sinh vien DTB >= 5:");
        for (SinhVien sv : sinhVienDTBTren5) {
        System.out.println(sv + ", DTB: " + sv.tinhDTB());
    }

        System.out.println();

    // In ra danh sách sinh viên có DTB < 5
        System.out.println("danh sach sinh vien  DTB < 5:");
        for (SinhVien sv : sinhVienDTBDuoi5) {
        System.out.println(sv + ", DTB: " + sv.tinhDTB());

    }
    }
}

