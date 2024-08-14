package org.bTap;

public class Test1 {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,05,2022);
        Ngay ngay2 = new Ngay(31,01,2022);
        Ngay ngay3 = new Ngay(16,02,2030);
        HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A ", "VietNam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B ", "My");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C ", "Balan");

        BoPhim bophim1 = new BoPhim("BoGia",2020,hangSanXuat1,65000,ngay1 );
        BoPhim bophim2 = new BoPhim("Running Man",2021,hangSanXuat2,100000,ngay2 );
        BoPhim bophim3 = new BoPhim("Kham Pha Balan",2025,hangSanXuat3,115000,ngay3 );
        System.out.println("Sosanh gia  1 re hon 2 : " + bophim1.kiemTraGiaVeReHon(bophim2) );
        System.out.println("Sosanh gia  1 re hon 2 : " + bophim3.kiemTraGiaVeReHon(bophim2) );

    }
}
