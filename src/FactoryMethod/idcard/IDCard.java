package FactoryMethod.idcard;
import FactoryMethod.framework.*;
// 인식 카드를 나타내는 클래스
public class IDCard extends Product {
    private String owner;

    // 생성자
    public IDCard(String owner) {
        System.out.print(owner + "카드 만듦\n");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.print(owner + "카드 사용\n");
    }

    public String getOwner() {
        return owner;
    }
}
