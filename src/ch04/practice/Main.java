package ch04.practice;

import ch04.practice.idcard.IDCardFactory;
import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;
import ch04.practice.idcard.IDCard;

public class Main {
  public static void main(String[] args) {
    //1. 신분증 생산 (직접)
    Product id01 = new IDCard("ygr"); //부모타입인 프로덕트로 생성
    //Product id01 = new IDCard(); //인자 없는 생성자 불가(명시적 생성자가 있기때문)
    id01.use();


    //2. 신분증 생산 (공장을 통해서)
    Factory f = new IDCardFactory();
    Product id02 = f.create("ygr2");
    id02.use();
  }
}
