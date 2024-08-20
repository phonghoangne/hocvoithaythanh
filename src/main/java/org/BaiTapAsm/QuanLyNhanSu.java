package org.BaiTapAsm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;


public class QuanLyNhanSu {
    private ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);


    public void nhapDanhSachSinhVien() {
        danhSachNhanVien.add(new NhanVienHanhChinh("thanhnc","Nguyen Chi Thanh",1000,
                LoaiNhanVien.HC.name()));


       System.out.println("Nhập số lượng nhân viên: ");
       int soLuong = scanner.nextInt();
       scanner.nextLine();
       for(int i=0 ; i < soLuong ; i++) {
           System.out.println("Nhap loai nhan vien : \n" +
                   "1.hanh chinh. \n" +
                   "2.tiep thi \n" +
                   "3. truong phong");
           int loai = scanner.nextInt();
           scanner.nextLine();
           System.out.println(" nhap ma nhan vien :");
           String ma = scanner.nextLine();
           System.out.println("Nhap loai nhan vien: ");
           String loaiNv = scanner.nextLine();
           System.out.println("nhap ho ten : ");
           String hoTen = scanner.nextLine();
           System.out.println("nhap luong co ban :");
           double luong = scanner.nextDouble();;

           if(loai == 1 ) {
               danhSachNhanVien.add(new NhanVienHanhChinh(ma,hoTen,luong ,loaiNv));
           } else if(loai ==2 ) {
               System.out.println("nhap doanh so ban hang ");
               double ds = scanner.nextDouble();
               System.out.println("nhap hoa hong ");
               double hh = scanner.nextDouble();
               danhSachNhanVien.add(new NhanVienTiepThi(ma,hoTen,luong,ds,hh,loaiNv));
           }else if(loai == 3 ){
               System.out.println("nhap luong trach nhiem ");
               double luongTrachNhiem = scanner.nextDouble();
               danhSachNhanVien.add(new TruongPhong(ma,hoTen,luong,luongTrachNhiem,loaiNv));
           }
       }
   }
   public void xuatDanhSachSinhVien(){
        for(NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }
   }
   public NhanVien timNhanVienTheoMa(String maNhanVien) {
       for (NhanVien nv : danhSachNhanVien) {
           if (nv.getMaNhanVien().equals(maNhanVien)) {
               return nv;
           }
       }
       return null;

   }
   public void xoaNhanVienTheoMa(String maNhanVien) {
        NhanVien nv = timNhanVienTheoMa(maNhanVien);
            if(nv != null) {
                danhSachNhanVien.remove(nv);
                System.out.println("Xoa nhan vien thanh cong . ");
            }else {
                System.out.println(" Khong the tim thay nhan vien");
            }
   }


   public void capNhatThongTinNhanVien(String maNhanVien, Scanner sc) {
        boolean check = false;
       int i = 0; // vi tri cua nhan vien can tim trong list
       // tiim thay duoc nhan vien can update
       // nhap thong tin nhan vien
       // su dung set trong list de cap nhat phan tu do
       for (int j = 0 ; j < danhSachNhanVien.size();j++) {
           NhanVien item = danhSachNhanVien.get(j);
           if(item.getMaNhanVien().equals(maNhanVien)){
               check = true;
               if (item.getLoaiNv().equals(LoaiNhanVien.HC))
               {
                   item = new NhanVienHanhChinh(LoaiNhanVien.HC);
                   item.nhapThongTinNhanVien(sc);
                   System.out.println(item);
                   break;
               }else if (item.getLoaiNv().equals(LoaiNhanVien.TP))
               {
                   item = new TruongPhong(LoaiNhanVien.TP);
                   item.nhapThongTinNhanVien(sc);
                   System.out.println(item);
                   break;
               }else if (item.getLoaiNv().equals(LoaiNhanVien.TT))
               {
                   item = new NhanVienTiepThi(LoaiNhanVien.TT);
                   item.nhapThongTinNhanVien(sc);
                   System.out.println(item);
                   break;
               }
               danhSachNhanVien.set(j,item);
               break;
           }
           }if(!check){
           System.out.println("Không tìm thấy mã nhân viên!!!");
       }
   }
// khi nhap ma nhan vien can cap nhat thi lap tuc bao la khong tim thay ma nhan vien
    // nhung sau do van nhap thong tin nhan vien vao va sua duoc
public void timNhanVienTheoLuong(double minLuong, double  maxLuong){
        for(NhanVien nv : danhSachNhanVien) {
            double thuNhap = nv.tinhThuNhap();
            if(thuNhap >= minLuong && thuNhap <= maxLuong){
                System.out.println(nv);
            }
        }
}
    public void sapXepNhanVienTheoHoTen(){
        Collections.sort(danhSachNhanVien,Comparator.comparing(NhanVien :: getHoTen));
    }
    public void sapXepNhanVienTheoThuNhap(){
        Collections.sort(danhSachNhanVien,Comparator.comparing(NhanVien :: tinhThuNhap).reversed());
    }
    public void xuat5NhanVienThuNhapCaoNhat(){
        sapXepNhanVienTheoThuNhap();
        System.out.println("Top 5 nhan vien co thu nhap cao nhat :");
        for(int i = 0 ; i < danhSachNhanVien.size();i++){
            System.out.println(danhSachNhanVien.get(i));
        }
    }

    public static void main(String[] args) {
    QuanLyNhanSu qlns = new QuanLyNhanSu();
    Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println("1.Nhap danh sach nhan vien ");
        System.out.println("2.Xuat danh sach nhan vien ");
        System.out.println("3.Tim nhan vien theo ma ");
        System.out.println("4.Xoa nhan vien theo ma ");
        System.out.println("5.Cap nhat thong tin nhan vien  ");
        System.out.println("6.Tim nhan vien theo khoang luong ");
        System.out.println("7.Sap xep nhan vien theo ten ");
        System.out.println("7.Sap xep nhan vien theo thu nhap ");
        System.out.println("9. Xuat 5  nhan vien co  thu nhap cao nhat   ");
        System.out.println("0. Thoat chuong trinh.");
        System.out.println("Chon chuc nang :");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 1 :
                qlns.nhapDanhSachSinhVien();
            case 2 :
                qlns.xuatDanhSachSinhVien();
            case 3 :
                System.out.println("Nhap ma nhan vien ");
                String ma = scanner.nextLine();
                NhanVien nv = qlns.timNhanVienTheoMa(ma);
                if(nv != null){
                    System.out.println(nv);
                }else {
                    System.out.println("Khong tim thay nhan vien ");
                }break;
            case 4:
                System.out.println("Nhap ma nv can xoa");
                qlns.xoaNhanVienTheoMa(scanner.nextLine());
                break;
            case 5:
                System.out.println("Nhap ma nv can cap nhat :");
                qlns.capNhatThongTinNhanVien(scanner.nextLine(),scanner);
                break;
            case 6:
                System.out.println("Nhap khoang luong toi thieu :");
                double minLuong = scanner.nextDouble();
                System.out.println("Nhap khoang luong toi da :");
                double maxLuong = scanner.nextDouble();
                qlns.timNhanVienTheoLuong(minLuong,maxLuong);
                break;
            case 7:
                qlns.sapXepNhanVienTheoHoTen();
                qlns.xuatDanhSachSinhVien();
                break;
            case 8:
                qlns.sapXepNhanVienTheoThuNhap();
                qlns.xuatDanhSachSinhVien();
                break;
            case 9:
                qlns.xuat5NhanVienThuNhapCaoNhat();
                break;
            case 0:
                System.out.println("Thoat chuong trinh .");
        }


    }

    }

}
