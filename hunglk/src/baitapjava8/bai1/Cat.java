package baitapjava8.bai1;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cats eat mouses");
    }

    @Override
    public void breath() {
        System.out.println("Cat's breath");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
