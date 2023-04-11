package hw.ch05;

import hw.ch05.idcard.IDCardFactoryGyuRiYang1;

public class Main1 {
  public static void main(String[] args) {
    System.out.println("<<20210811 양규리>>");

    System.out.println("Start.");
    IDCardFactoryGyuRiYang1 factory1 = IDCardFactoryGyuRiYang1.getInstance();
    IDCardFactoryGyuRiYang1 factory2 = IDCardFactoryGyuRiYang1.getInstance();
        if (factory1 == factory2) {
            System.out.println("factory1과 factory2는 같은 인스턴스 입니다");
        } else {
            System.out.println("factory1과 factory2는 같은 인스턴스가 아닙니다");
        }
        System.out.println("End.");
  }
}
