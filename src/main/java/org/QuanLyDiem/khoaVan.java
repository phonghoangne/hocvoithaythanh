package org.QuanLyDiem;

public class khoaVan extends NamHoc2023{
    public khoaVan(String ten, String cccd) {
        super(ten, cccd);
    }
    // overide

    @Override
    public void tinhDTB() {
        System.out.println("Day la phuong thuc tinh dtb cua khoa van ");

    }
}
