package java8.lab2;

@FunctionalInterface
public interface Movie {
	void detail();
}

//Một Functional Interface hợp lệ chỉ có duy nhất một method trừu tượng
//Functional Interface ko có lớp trừu tượng là không hợp lệ, Functional Interface nhiều hơn 1 lớp trừu tượng là không hợp lệ
//Một Functional Interface có thể có các phương thức của lớp java.lang.Object nhưng vẫn phải có 1 method trừu tượng.