package oop;
// tinh truu tuong la dinh nghia 1 hanh dong trong lop doi tuong chua hoan chinh
public abstract class BaseUser {
    private String name;
    private int age;

    public BaseUser(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    //dinh nghia ra nhung phuong thuc truu tuong (khong co noi dung
public abstract void showMessage();
}
