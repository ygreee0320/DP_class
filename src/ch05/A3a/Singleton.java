package ch05.A3a;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown(); //생성 시 시간이 걸리게 하기위해서
    }

    //public static Singleton getInstance() {
    public static synchronized Singleton getInstance() { //한스레드가 일을 마쳐야 다른 스레드 들어올 수 있도록
        if (singleton == null) {
            singleton = new Singleton(); //lazy initailization
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); //생성이 적어도 1초는 걸리게
        } catch (InterruptedException e) {
        }
    }
}
