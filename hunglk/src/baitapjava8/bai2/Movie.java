package baitapjava8.bai2;

@FunctionalInterface
public interface Movie {
    // @FunctionalInterface Không có phương thức trừu tượng sẽ bị lỗi
    public void detail();
}
