package ch10.Sample;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;  //임의의 수 생성기
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed); 
    }

    @Override
    public Hand nextHand() {
        if (!won) { //직전에 졌으면 
            prevHand = Hand.getHand(random.nextInt(3)); //손을 새로 얻는다.
        }
        //직전에 이겼으면 직전 손을 그대로 리턴
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
