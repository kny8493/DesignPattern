package idcard;
import framework.*;

public class IDCard extends Product {
    private String owner;

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
