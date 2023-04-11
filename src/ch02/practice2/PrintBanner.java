package ch02.practice2;

// 어댑터(위임을 이용), (extends 뒤에 두개 올 수 없음)
public class PrintBanner extends Print {
  //어댑티를 가리키는 변수가 존재해야 위임 가능
  private Banner banner;

  private String string; //스트링 담는 배너 생성

  public PrintBanner(String string) {
    this.string = string;
    banner = new Banner(string);
  }

  @Override
  public void printStrong() { //12볼트 실행되면
    banner.showWithAster(); //어댑터의 220볼트 호출(위임)
    
  }

  @Override
  public void printWeak() {
    banner.showWithParen();
    
  }

}
