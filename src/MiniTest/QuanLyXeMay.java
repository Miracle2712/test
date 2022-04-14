package MiniTest;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay>{
    private XeMay[] danhSach = new XeMay[2];
    private int size = 0 ;


    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        if (timKiem(name) != -1)
        danhSach[timKiem(name)] = xeMay;
    }

    @Override
    public void xoa(String name) {

    }

    @Override
    public int timKiem(String name) {
        for(int i=0; i<size; i++){
            if(name == danhSach[i].getTen()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach);
    }

    @Override
    public void print() {
        for (int i=0; i<size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("-----------------------------------");

    }

    public static void main(String[] args) {
        QuanLyXeMay ql = new QuanLyXeMay();
        XeMay xm1 = new XeMay( "Honda" , "đỏ" ,"Cup", 50,150);
        XeMay xm2 = new XeMay( "KTM" , "đen cam" ,"Duke1290", 400,300);
        ql.them(xm1);
        ql.them(xm2);
        ql.print();
        XeMay xm3 = new XeMay("Kawasaki" , "xanh lá" , "z1000" , 500 , 1000);
        ql.sua("z1000",xm3);
        ql.print();
        ql.sapXep();
        ql.print();
    }


}
