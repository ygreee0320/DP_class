package hw.ch03;

public class Main {
  public static void main(String[] args) {
    System.out.println("20210811 양규리");

    AbstractDisplay c; //부모타입으로 변수 선언시, 어느 것을 대입해도 동작
    c = new YangGyuRiDisplay("양규리", "20210811", 3); //변수타입은 부모타입으로 하는게 좋음

    c.display(5);

  }
}
