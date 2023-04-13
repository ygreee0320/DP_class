package ch10.Q4;

import java.util.Comparator;

public class ComparatorDesending implements Comparator {

  @Override
  public int compare(Object a, Object b) {
    return ((String)b).compareTo((String) a); 
    // b가 더 클때 양수가 반환됨 -> 뒤에 있는 것이 더 클 때 위치를 서로 바꿈
    // => 뒤에 있는 게 앞으로 옴 => 내림차순
    
  }
  
}
