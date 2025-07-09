package oop.bt;

public class nhanvienvanphong extends nhanvien{
     //constructor
    public nhanvienvanphong(String name, int id, double soGioLamViec){
        super(name, id, soGioLamViec);
}
@Override
public double tinhTongLuong(){
    return getSoGioLamViec() * 5000;
    }
}
