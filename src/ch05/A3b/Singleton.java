package ch05.A3b;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown(); 
    }

    //synchronized: 동시에 두개 이상의 스레드가 이 메소드 안으로 들어오지 못하게
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
    //인터럽트: 스레드 종료(하던일 멈추도록)
    //자고있는 동안 외부에서 인터럽트 도착하면? => 인터럽트익셉션
}
