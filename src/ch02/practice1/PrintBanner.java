package ch02.practice1;

//어댑터(상속을 이용하기), 항상 타겟 인터페이스를 구현함
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) { //생성자
        super(string); //부모 생성자
    }

    @Override
    //메소드 이름이 변환된다.(printWeak 실행해도 실제 일은 showWithParen이 함)
    public void printWeak() { //12볼트라면
        showWithParen(); //220볼트가 일하도록
    }

    @Override
    
    public void printStrong() {
        showWithAster();
    }
}
