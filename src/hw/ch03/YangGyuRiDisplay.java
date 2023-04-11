package hw.ch03;

public class YangGyuRiDisplay extends AbstractDisplay {
    private String name; 
    private String studentId;
    private int grade;

    // 생성자 
    public YangGyuRiDisplay(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    @Override
    public void open() { //오픈, 프린트, 클로즈를 어떻게 할지는 자식이 결정(부모는 오픈한다, 프린트한다 등의 틀을 제공)
        System.out.println("====================");
        System.out.println("덕성여대 컴퓨터공학과");
    }

    @Override
    public void print() {
        System.out.println("학번 " + studentId + " / " + grade + "학년 / " + name);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println("템플릿 메소드 패턴 숙제입니다.");
        System.out.println("====================");
    }
}
