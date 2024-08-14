package org.QuanLyDiem;

public class khoaToan extends NamHoc2023 {
    public khoaToan(String ten, String cccd) {
        super(ten, cccd);
    }

   // overide

    @Override
    public void tinhDTB() {
        System.out.println("Day la phuong thuc tinh dtb cua khoa toan ");

    }
}
