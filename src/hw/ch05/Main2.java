package hw.ch05;

import hw.ch05.idcard.IDCardFactoryGyuRiYang2;

public class Main2 extends Thread{
  public static void main(String[] args) {
    System.out.println("<<20210811 양규리>>");
    System.out.println("Start.");
    new Main2("최승훈").start();
    new Main2("양규리").start();
    new Main2("박희서").start();
    System.out.println("End.");
  }

  @Override
  public void run() {
    IDCardFactoryGyuRiYang2 obj = IDCardFactoryGyuRiYang2.getInstance();
    System.out.println(getName() + ": 인스턴스 주소 = " + obj);
  }

  public Main2(String name) {
    super(name);
  }
}