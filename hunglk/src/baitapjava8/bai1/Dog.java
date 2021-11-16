package baitapjava8.bai1;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dogs eat shit");
    }

    @Override
    public void breath() {
        System.out.println("Dog's breath");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
