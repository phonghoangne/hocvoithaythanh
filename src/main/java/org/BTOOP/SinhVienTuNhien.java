package org.BTOOP;

public class SinhVienTuNhien extends SinhVien {
    private double toan, van, ly, hoa, sinh;

    public SinhVienTuNhien(String mssv, String ten, int tuoi, double toan, double van, double ly, double hoa, double sinh) {
        super(mssv, ten, tuoi);
        this.toan = toan;
        this.van = van;
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
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

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getSinh() {
        return sinh;
    }

    public void setSinh(double sinh) {
        this.sinh = sinh;
    }

    public double tinhDTB() {
        double dtbTN = (toan + van + 2 * (ly + hoa + sinh)) / 8;
        return dtbTN;
    }

    @Override
    public String toString() {
        return super.toString() + ", Toán=" + toan + ", Văn=" + van + ", Lý=" + ly + ", Hóa=" + hoa + ", Sinh=" + sinh;
    }
}
