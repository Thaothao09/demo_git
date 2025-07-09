package oop.bt;

public class nhanviensanxuat extends nhanvien {
    //thuoc tinh

    //constructor
    public nhanviensanxuat(String name, int id, double soGioLamViec){
        super(name, id, soGioLamViec);
    }
    @Override
    public double tinhTongLuong(){
        return getSoGioLamViec() * 2000;
    }
}
