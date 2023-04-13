package ch10.Q4;

import java.util.Comparator;

public class ComparatorAscending implements Comparator {

  @Override
  public int compare(Object a, Object b) { //두개의 크기 비교
    // 원칙: 정렬 주체(List)는 음수가 리턴되면 그대로 두고, 양수가 리턴되면 위치를 서로 바꾼다.
    return ((String)a).compareTo((String) b); //String 클래스의 compareTo()를 이용해서 크기 비교함.
    //컴패래터에서 오브젝트 타입으로 컴페어 실행 -> 결과는 스트링으로(메인에서 스트링 필요) -> .이 우선순위 제일 높아서 ()사용
    // (a - b)를 실행
    // a가 작을 때는 음수가 리턴됨, a가 클때는 양수가 리턴됨
    // a가 더 클 때 위치를 서로 바꾼다. => 큰 걸 뒤로 보낸다 => 오름차순
  } 
  
}
