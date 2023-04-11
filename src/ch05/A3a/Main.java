package ch05.A3a;

public class Main extends Thread { //스레드 상속받음
    public static void main(String[] args) {
        System.out.println("Start.");

        // 스레드 객체 3개 만들고, 각각 시작시킴
        new Main("A").start(); //스레드의 run()을 자동으로 실행함
        new Main("B").start();
        new Main("C").start();
        System.out.println("End.");
    }

    @Override
    public void run() {
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }

    public Main(String name) {
        super(name);
    }
}
