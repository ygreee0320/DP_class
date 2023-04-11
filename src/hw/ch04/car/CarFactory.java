package hw.ch04.car;

import java.util.Iterator;
import java.util.Vector;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class CarFactory extends Factory {
  Vector<String> modelNames = new Vector<>();
  
  @Override
  protected Car_GyuRiYang createProduct(String modelName) {
    return new Car_GyuRiYang(modelName);
  }

  @Override
  protected void registerProduct(Product product) {
    modelNames.add(product.toString());
  }

  public void printAllModelNames() {
    Iterator it = modelNames.iterator();

    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
