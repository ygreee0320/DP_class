package ch10.practice;

public class Player {
    private String name = "";
    private Strategy strategy; // 현재 전략을 보관(부모타입으로 선언됨, 자식 중 어떤것이든지 가질 수 있음(probstrategy, winning))
    private int wincount = 0;
    private int losecount = 0;
    private int gamecount = 0;

    // 이름과 전략을 받아서 플레이어를 만든다 
    public Player(String name, Strategy strategy) { //Strategy를 통해 여러종류의 전략 중 받을 수 있음
        this.name = name;
        this.strategy = strategy;
    }

    // 전략에 따라 다음 손을 결정한다
    public Hand nextHand() {
        return strategy.nextHand(); // 현재 전략 객체에게 위임
    }

    // 승리
    public void win() {
        strategy.study(true); // 현재 전략 객체에게 결과를 알려줌
        wincount++; //이긴 횟수+1
        gamecount++; //게임 횟수+1
    }

    // 패배
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    // 무승부 
    public void even() {
        gamecount++;
    }

    @Override
    public String toString() {
        return "["
            + name + ":"
            + gamecount + " games, "
            + wincount + " win, "
            + losecount + " lose"
            + "]";
    }

    // 전략 교체 메소드
    public void setStrategy(Strategy s) {
        this.strategy = s;
    }
}
