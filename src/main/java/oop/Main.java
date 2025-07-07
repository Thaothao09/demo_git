package oop;

public class Main {
    public static void main(String[] args){
        //tạo ra 1 đối tượng là user
        User user = new User("Thành ",18, " 123123");
        user.displayInfo();

        user.setName("Giang");
        user.setAge(27);
        user.displayInfo();

        //tạo ra 1 đối tượng là admin
        Admin admin = new Admin("An", 20, "123456789", "ADMIN");
        admin.displayAdminInfo();

        Guest guest = new Guest("Tuyến", 18, "0919", "phuongthao");
        guest.displayInfo();
        guest.welcomeMessage();
    }
}
