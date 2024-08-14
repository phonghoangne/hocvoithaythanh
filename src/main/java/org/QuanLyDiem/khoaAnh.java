package org.QuanLyDiem;

public class khoaAnh extends NamHoc2023{
    public khoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }
    // overide

    @Override
    public void tinhDTB() {
        System.out.println("Day la phuong thuc tinh dtb cua khoa anh ");

    }
}
