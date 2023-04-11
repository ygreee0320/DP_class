package hw.ch05.idcard;

public class IDCardFactoryGyuRiYang1 {
    private static IDCardFactoryGyuRiYang1 singleton = new IDCardFactoryGyuRiYang1();

    private IDCardFactoryGyuRiYang1() {
        //eager initialization (미리 생성)
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static IDCardFactoryGyuRiYang1 getInstance() {
        return singleton;
    }
}
