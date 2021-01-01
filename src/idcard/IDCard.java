package idcard;
import framework.*;

public class IDCard extends Product {
    private String owner;
    private int serial;

    public IDCard(String owner, int serial) {
        System.out.print("["+serial+"]"+owner + "카드 사용\n");
        this.owner = owner;
        this.serial = serial;
    }
    @Override
    public void use() {
        System.out.print("["+serial+"]"+owner + "카드 사용\n");
    }

    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
}
