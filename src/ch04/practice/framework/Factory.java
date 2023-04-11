package ch04.practice.framework;

public abstract class Factory { 
    // 제품 생산 시의 큰 흐름을 결정 => 템플릿 메소드
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 자식이 구체적인 생산 방법을 결정(제품 생산 관련 일) =>factory method
    //protected abstract Product createProduct(String owner); //첫번째 방법) 선언
    protected Product createProduct(String owner) {
        // 두번째 방법) 디폴트 구현(부모쪽에서 미리 구현하여 자식이 물려받음)
        return null;
    }

    protected abstract void registerProduct(Product product); 
}
