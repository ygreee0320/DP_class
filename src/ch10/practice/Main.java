package ch10.practice;

public class Main {
  public static void main(String[] args) {
    /* 
    //바위
    Hand h1 = Hand.ROCK; //어느 enum클래스에 있는 상수인지 알려줘야 함.
    System.out.println(h1);

    //가위
    Hand h2 = Hand.getHand(1);
    System.out.println(h2);

    //h1과 h2중 누가 이기나 해보기
    if(h1.isStrongerThan(h2)) {
      System.out.println("h1이 h2보다 세다");
    } else if (h1.isWeakerThan(h2)) {
      System.out.println("h1이 h2보다 약하다");
    } else {
      System.out.println("무승부");
    }

    Strategy s1 = new WinningStrategy(100);

    Hand h3  = s1.nextHand();
    System.out.println(h3);

    s1.study(true); //게임에서 이겼음을 알려줌
    Hand h4 = s1.nextHand(); //다시 손을 얻었을때 같은값(가위)이 나오는 지 체크
    System.out.println(h4);
  
  */

  // 게임 진행

    // 1. 플레이어 생성
    Player p1 = new Player("양규리", new ProbStrategy(100)); // 전략 지정
    Player p2 = new Player("박보검", new WinningStrategy(200));

    p2.setStrategy(new ProbStrategy(2222)); // 동적으로(실행중에) 전략이 교체됨

  for(int i=0; i <500; i++) {
    // 2. 게임 시작
    Hand h1 = p1.nextHand();
    Hand h2 = p2.nextHand();

    if(h1.isStrongerThan(h2)) {
      p1.win();
      p2.lose();
      System.out.println("Winner: " + p1);
    } else if (h1.isWeakerThan(h2)) {
      p1.lose();
      p2.win();
      System.out.println("Winner: " + p2);
    } else {
      p1.even();
      p2.even();
      System.out.println("Even... ");
    }
  }

  System.out.println("Final Result: ");
  System.out.println(p1);
  System.out.println(p2);

  }
}