package oop.bt;

public abstract class nhanvien {
    //thuoc tinh
    private String name;
    private int id;
    private double soGioLamViec;

    //constructor
    public nhanvien(String name, int id, double soGioLamViec) {
        this.name = name;
        this.id = id;
        this.soGioLamViec = soGioLamViec;
    }
        //phuong thuc
        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }
        public double getSoGioLamViec() {
            return soGioLamViec;
        }
        public abstract  double tinhTongLuong();
    public void inThongTin(){
        System.out.println("Nhan vien: " + name + "; id:" + id + "; Tong luong: " + tinhTongLuong());
        }
    }

