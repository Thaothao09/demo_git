package oop.bt2;

public abstract class TaiKhoan {
    //thuộc tính
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    //constructor
    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    //phương thức

    public String getsoTaiKhoan() {
        return soTaiKhoan;
    }
    public double getSoDu() {
        return soDu;
    }
    public void guiTien(double soTien){
        if(soTien > 0){
            soDu += soTien;
        }
    }
    public void rutTien(double soTien){
        if(soTien > 0 && soTien <= soDu){
            soDu -= soTien;
        }
    }
    public abstract double tinhLai();
    public void hienThiThongTin(){
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Chủ tài khoản: " + soDu);
        System.out.println("Số dư: " + soDu);
        System.out.println("Số tiền lãi: " + tinhLai());
        System.out.println("-------------------------------------");
    }
}
