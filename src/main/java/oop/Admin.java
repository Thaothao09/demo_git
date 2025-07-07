package oop;
//tính kế thừa, để admin kế thừa lại từ user
public class Admin extends User {
    //thuộc tính riêng của admin
    private String role;

    //constructor để khởi tạo
    public Admin(String name, int age, String soDT, String role){
        super(name, age, soDT);
        this.role=role;
    }
    //tạo phương thức để lấy giá trị
    public String getRole(){
        return role;
    }
    //tạo phương thức để update giá trị
    public void setRole(String role){
        this.role=role;
    }
    public void displayAdminInfo(){
        displayInfo(); //kế thừa từ lớp cha (name, age, soDT)
        System.out.println("Role:" + role);
    }
}
