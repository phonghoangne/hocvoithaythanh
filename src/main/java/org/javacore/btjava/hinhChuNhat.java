package org.javacore.btjava;

public class hinhChuNhat {
    double height ;
    double width ;

    public hinhChuNhat(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double chuVi() {
        return (height + width) * 2;
    }
    public double dienTich(){
        return height * width;
    }
    
}
