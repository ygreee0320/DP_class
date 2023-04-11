package ch03.practice;

public class Main {
  public static void main(String[] args) {
    AbstractDisplay c; //부모타입으로 변수 선언시, 어느 것을 대입해도 동작
    c = new CharDisplay('a'); //변수타입은 부모타입으로 하는게 좋음
    c.open();
    c.print();
    c.close();

    c.display();


    //AbstractDisplay s = new StringDisplay("양규리");
    c.open(); 
    c.print();
    c.close();

    c.display();
  }
}
