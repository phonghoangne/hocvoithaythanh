package org.javacore;

public  class SinhVien{
    // thuoc tinh
    private String hoTen;
    private double diem;
     // contructor mac dinh

    public SinhVien() {
        hoTen = "No Name";
        diem = 0.0;
    }
// constructor co doi so

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(double diem, String hoTen) {
        this.diem = diem;
        this.hoTen = hoTen;
    }


    // phuong thuc
    public void hienThiThongTin(){
        System.out.println(hoTen + ":" + diem);

    }
    // phuong thuc co kieu tra ve
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan + diemVan)/2;
    }




    // get va set
    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    // toString

    @Override
    public String toString() {
        return hoTen  + diem;
    }

    //Support Method vva Service Methhod
    //Support Method
    private boolean checkDiem(){
        return this.diem >= 24;
    }
    //  Service Methhod
    public void checkHopLeDiem(){
        if(checkDiem())
            System.out.println("Diem hop le, tiep  tuc nhap thong tin ");
        else
            System.out.println("Kiem tra lai diem dau vao  cua sinh vien ");}
}