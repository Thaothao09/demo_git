package oop;
//tính đa hình: khả năng của một đối tượng có nhiều hình thái khác nhau - cùng 1 phương thức
public class Guest extends User {
    private String email;

    public Guest(String name, int age, String soDT, String email) {
        super(name, age, soDT);
        this.email = email;
    }

    @Override
    public void displayInfo() {
        System.out.println("Email:" + email);
    }

    ;
}
