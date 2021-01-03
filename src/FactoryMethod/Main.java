package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class Main{
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("김카드");
    Product card2 = factory.create("이카드");
    Product card3 = factory.create("박카드");

    card1.use();
    card2.use();
    card3.use();
  }
}