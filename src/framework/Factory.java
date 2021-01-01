package framework;

import idcard.IDCard;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        // Product p = createNew(owner);
        registerProduct(p);
        return p;
    }
    // 자바의 특징 -> 접근지정자 (protected, public, private) => 캡슐화
    // createProduct : 인스턴스 생성을 위한 메소드
    // new로 실제 인스턴스를 생성하는 대신 인스턴스 생성을 위한 메소드를 호출해서 구체적인 클래스 이름에 의한 속박에서 상위 클래스를 자유롭게함
    //protected Product createNew (String owner) {
      //return new IDCard(owner);
   //}
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
