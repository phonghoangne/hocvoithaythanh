package org.Test;

import org.bTap.DanhSachSinhVien;
import org.bTap.SinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            DanhSachSinhVien dssv= new DanhSachSinhVien();
            int luaChon = 0;

             do{
                 System.out.println("MENU-----------");
                 System.out.println("Vui lòng lựa chọn chức năng : ");
                 System.out.println(
                     "1. Thêm sinh viên vào danh sách. \n" +
                     "2. In danh sách sinh viên ra màn hình. \n" +
                     "3. Kiểm tra danh sách có rỗng hay không. \n" +
                     "4. Lấy ra số lượng sinh viên trong danh sách. \n" +
                             "5. Làm rỗng danh sách sinh viên. \n " +
                             "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không dựa trên masv \n" +
                             "7. Xoa 1 sinh viên ra khỏi danh sách dựa trên mã sinh vien \n " +
                             "8. Tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím \n" +
                             "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp. \n" +
                             "0. Thoat khoi chuong trinh"   );
                         luaChon = sc.nextInt();
                 sc.nextLine();
                     if(luaChon == 1) {
                         System.out.println("Nhap ma sinh vien : "); String maSinhVien = sc.nextLine();
                         System.out.println("Nhap ho va ten : "); String hoVaTen = sc.nextLine();
                         System.out.println("Nhap nam sinh : "); int namSinh = sc.nextInt();
                         System.out.println("Nhap diem trung binh  : "); float  diemTrungBinh = sc.nextFloat();
                         SinhVien sv = new SinhVien( maSinhVien,  hoVaTen,  namSinh,  diemTrungBinh);
                         dssv.themSinhVien(sv);
                     }else if (luaChon == 2) {
                         // In danh sách sinh viên ra màn hình.
                         dssv.inDanhSachSinhVien();

                     }else if (luaChon == 3) {
                         // kiem tra danh sach sinh vien co rong hay khong
                         System.out.println("Danh sacnh rong : " + dssv.kiemTraDanhSachRong());

                     }else if (luaChon == 4) {
                         System.out.println("So luong hien tai : " + dssv.laySoLuongSinhVien());


                     }else if (luaChon == 5) {
                         // lam rong danh sach sinh vien
                         dssv.lamRongDanhSachSinhVien();


                     }else if (luaChon == 6) {

                     }else if (luaChon == 7) {

                     }else if (luaChon == 8) {

                     }else if (luaChon == 9) {


                     }



             }while(luaChon != 0);
    }
}
