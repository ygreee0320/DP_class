package ch02.practice2;

public class Main {
  public static void main(String[] arg) {

    //1) Banner 이용하기
    //소스 코드를 얻을 수 없다.
    Banner b = new Banner("ygr");
    b.showWithParen();
    b.showWithAster();

    //가정: Banner를 클라이언트가 직접 사용하지 못한다면?
    //2) 어댑터를 이용하기
    //Banner 클래스를 수정해도 클라이언트는 영향받지X
    //Banner 클래스를 수정하지 않고도 클라이언트가 원하는 형태로 사용가능
    Print x = new PrintBanner("ygr"); //어댑터 생성
    x.printWeak();
    x.printStrong();
  }
}
