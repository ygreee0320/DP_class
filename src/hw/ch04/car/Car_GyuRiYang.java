package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_GyuRiYang extends Product{
  protected String modelName;

  public Car_GyuRiYang(String modelName) {
    this.modelName = modelName;
  }

  @Override
  public void use() {
    System.out.println("모델명 " + modelName + "인 car를 사용합니다");
  }

  public String getModelName() {
    return modelName;
  }

  @Override
    public String toString() {  //Object 클래스로부터 상속(프로덕트의 부모인 오브젝트)
      return modelName;
    }
}
