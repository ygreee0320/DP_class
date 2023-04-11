package ch03.practice;

public class CharDisplay extends AbstractDisplay {
    private char ch; // 표시해야 하는 문자 

    // 생성자 
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() { //오픈, 프린트, 클로즈를 어떻게 할지는 자식이 결정(부모는 오픈한다, 프린트한다 등의 틀을 제공)
        // 시작 문자열 "<<"를 표시한다
        System.out.print("<<");
    }

    @Override
    public void print() {
        // 필드에 기억해 둔 문자를 1회 표시한다 
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println(">>");
    }
}
