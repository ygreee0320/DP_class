package ch02.practice1;

public class Main {
  public static void main(String[] arg) {

    //1) Banner 이용하기
    Banner b = new Banner("ygr");
    b.showWithParen();
    b.showWithAster();

    //가정: Banner를 클라이언트가 직접 사용하지 못한다면?
    //2) 어댑터를 이용하기
    //Banner 클래스를 수정해도 클라이언트는 영향받지X
    Print x = new PrintBanner("ygr"); //어댑터 생성
    x.printWeak();
    x.printStrong();
  }
}
