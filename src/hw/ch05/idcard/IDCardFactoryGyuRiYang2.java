package hw.ch05.idcard;

public class IDCardFactoryGyuRiYang2 {
    private static IDCardFactoryGyuRiYang2 singleton = null;

    private IDCardFactoryGyuRiYang2() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    public static synchronized IDCardFactoryGyuRiYang2 getInstance() {
        if (singleton == null) {
            singleton = new IDCardFactoryGyuRiYang2();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
}
