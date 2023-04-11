package hw.ch04;

import hw.ch04.car.CarFactory;
import hw.ch04.framework.Product;

public class Main {
  public static void main(String[] args) {
    System.out.println("<<20210811 양규리>>");

    CarFactory f = new CarFactory();
    Product car1 = f.create("양규리");
    car1.use();
    Product car2 = f.create("그랜저");
    car2.use();
    Product car3 = f.create("소나타");
    car3.use();
    Product car4 = f.create("캐스퍼");
    car4.use();

    System.out.println();
    System.out.println("<모델명 리스트>");
    f.printAllModelNames();
  }
}
