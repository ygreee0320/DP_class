package ch05.practice;

// 싱글턴 패턴을 적용
public class Singleton {
  //3. Singleton 객체 미리 생성
  //static: 클래스에 속한다. -> 객체 생성 전에 먼저 이 변수가 만들어짐(미리)
  private static Singleton singleton = new Singleton();
  
  //1. 생성자를 private로 한다.
  private Singleton() {
    System.out.println("인스턴스가 생성되었습니다.");
  }

  // 2. 객체를 얻어가는 메서드를 구현
  // 얘도 static <- 스태틱 아닌 메소드에게서 스태틱으로 호출할 수 없음
  // 객체 생성전에 미리 생성됨
  public static Singleton getInstance() {
    return singleton; //static으로 인해 미리 생성된 변수를 리턴
  }

  
  enum Month {
    January, Feburary, March, April, May;
  }

  //enum사용법: Month.January;
}
