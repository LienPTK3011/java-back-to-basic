package baitapjava8.bai1;

public interface Animal {
    public static final int a = 10; // vừa static vừa final
    public void eat();
    public void breath();
    default void run() {
        System.out.println("Animals run");
    }
}
