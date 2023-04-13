package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A"); //문자열 리스트 생성
        //Arrays: 배열관련 여러 기능을 제공하는 클래스
        //asList(원소들) : 원소들을 나열하는 리스트 생성

        // 사전순으로 작은 순서(오름차순)
        // list : 전략을 이용하는 컨텍스트
        // Comparator : 전략 객체
        list.sort( new ComparatorAscending() );
        System.out.println(list);

        // 사전순으로 큰 순서(내림차순)
        list.sort( new ComparatorDesending() );
        System.out.println(list);
    }
}
