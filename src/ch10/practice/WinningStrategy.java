package ch10.practice;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false; //초깃값(짐)
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed); //시드가 같으면 동일한 숫자가 생성됨 (다르게하면 다른 임의의 수 생성)
    }

    //이겼으면 이긴 값 그대로 내는 전략, 지면 새로
    @Override
    public Hand nextHand() {
        if (!won) { //직전에 졌으면
            prevHand = Hand.getHand(random.nextInt(3)); //손을 새로 얻는다.
        }
        return prevHand; //직전에 이겼으면 이겼던 손을 그대로 리턴
    }

    @Override
    public void study(boolean win) {
        won = win; //이겼는지 졌는지를 담음
    }
}
