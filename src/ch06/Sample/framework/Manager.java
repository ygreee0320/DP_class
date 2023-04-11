package ch06.Sample.framework;

import java.util.HashMap;
import java.util.Map;

// Product라는 부모타입을 이용해서 구현됨
// 원칙: programming to Interface/Abstract class
public class Manager {
    private Map<String,Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) { //프로덕트:부모타입
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        //return p;
        //return p.clone(); //불가=> clone() 메소드는 자시 자신만 호출할 수 있다.
        return p.createCopy(); // 복제품을 만들어서 리턴함
    }
}
