package org.BTOOP;

public class SinhVienXaHoi extends SinhVien {
    private double toan, van, su, dia, gdcd;

    public SinhVienXaHoi(String mssv, String ten, int tuoi, double toan, double van, double su, double dia, double gdcd) {
        super(mssv, ten, tuoi);
        this.toan = toan;
        this.van = van;
        this.su = su;
        this.dia = dia;
        this.gdcd = gdcd;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public double getGdcd() {
        return gdcd;
    }

    public void setGdcd(double gdcd) {
        this.gdcd = gdcd;
    }

    public double tinhDTB() {
        double dtbXH = (toan + van + 2 * (su + dia + gdcd)) / 8;
        return dtbXH;
    }

    @Override
    public String toString() {
        return super.toString() + ", Toán=" + toan + ", Văn=" + van + ", Sử=" + su + ", Địa=" + dia + ", GDCD=" + gdcd;
    }
}
