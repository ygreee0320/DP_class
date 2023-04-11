package ch10.practice;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    // 2차원 배열(인덱스 2개 이용하여 원소 하나 꺼냄)
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue)); //다 더한 값까지의 범위 중에서 난수 생성
        int handvalue = 0;

        if (bet < history[currentHandValue][0]) { // 0번째 값보다 작은지(첫 번째 구간) 체크
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {// 두 번째 구간인지 체크
            handvalue = 1;
        } else {  // 세 번째 구간이면
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue; //또 써먹기 위해, 다음을 위해 담아둠
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) { // 지정 행을 다 더함
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++; //이겼으면 해당 칸에 +1
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++; //지면 같은 줄 중 해당 칸을 제외한 나머지 칸 +1(해도되고 안해도됨)
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
