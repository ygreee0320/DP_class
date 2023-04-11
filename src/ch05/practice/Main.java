package ch05.practice;

public class Main {
  public static void main(String[] args) {
    Singleton x1 = Singleton.getInstance();
    //클래스 로딩될 때 한번만 생성됨(인스턴스는 한번만 생성됨)
    //메인 실행 중 싱글턴 필요 -> 싱글턴 클래스 로드 -> 인스턴스 생성
    Singleton x2 = Singleton.getInstance();

    if(x1 == x2) { // 이게 출력됨(같은 주소인지 비교)
      System.out.println("x1과 x2는 같은 인스턴스입니다.");
    } else {
      System.out.println("x1과 x2는 다른 인스턴스입니다.");
    }
  }

}
