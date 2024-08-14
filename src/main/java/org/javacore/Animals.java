package org.javacore;
/* thiết kế 1 abtract class animal gồm các thuộc tính lông, chieucao, cannang  trong animal có các phương thức trừ tượng ăn, uống , kêu và phương thức không trừ tượng là
in ra thông tin abtract



1 class dog kế thừa từ animal triển khai các phương thức ăn ( xuất ra màn hình dog eat) uống ( xuất ra màn hình dog drink ) kêu ( xuất ra màn hình dog noise).*/

public abstract class Animals {
    String name;
    int chieucao;
    float cannang;
    public abstract void eat();
    public abstract void drink();
    public abstract void noise();
    public Animals() {}; // ham tao k tham so
    // ham tao day du tham so
    public Animals(String name, int chieucao, float cannang) {
        this.name = name;
        this.chieucao = chieucao;
        this.cannang = cannang;
    }
    // phuong thuc in ra cac thong tin abst
    public void print(){
        System.out.println(this.name);
        System.out.println(this.chieucao);
        System.out.println(this.cannang);
    }

}

