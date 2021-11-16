package baitapjava8.bai1;

public class Fish implements Animal{
    @Override
    public void eat() {
        System.out.println("Fish eat worm");
    }

    @Override
    public void breath() {
        System.out.println("Fish's breath");
    }
}
