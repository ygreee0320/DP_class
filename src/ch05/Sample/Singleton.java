package ch05.Sample;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        //eager initialization (미리 생성)
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
