package hw.ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    public final void display(int times) { //구상 메소드, 위의 추상 메소드를 사용, 큰 틀을 제공(템플릿 메소드)
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
