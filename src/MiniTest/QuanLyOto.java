package MiniTest;

import java.util.Arrays;

public class QuanLyOto implements QuanLy<Oto>{
    private Oto[] danhSach = new Oto[3];
    private int size = 0 ;


    @Override
    public void them(Oto oto) {
        danhSach[size] = oto;
        size++;
    }

    @Override
    public void sua(String name, Oto oto) {
        if (timKiem(name) != -1)
            danhSach[timKiem(name)] = oto;
    }

    @Override
    public void xoa(String name) {
        danhSach[timKiem(name)] = null;
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
        QuanLyOto ql = new QuanLyOto();
        Oto ot1 = new Oto( "Toyota" , "đỏ" ,"Camry 2022", 2000,500);
        Oto ot2 = new Oto( "KIA" , "đen cam" ,"K3", 800,300);
        Oto ot3 = new Oto( "KIA" , "đen cam" ,"K3", 800,300);
        ql.them(ot1);
        ql.them(ot2);
        ql.them(ot3);
        ql.print();
        Oto ot4 = new Oto("Mitsubishi" , "xanh lá" , "Outlander" , 1400 , 300);
        ql.sua("Outlander",ot4);
        ql.print();
        ql.sapXep();
        ql.print();
    }


}
