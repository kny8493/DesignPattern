package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private HashMap db = new HashMap();
    private int serial=100;

    private List owners = new ArrayList();

    @Override
    // synchronized -
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        db.put(new Integer(card.getSerial()), card.getOwner());

        owners.add(((IDCard)product).getOwner());
    }
    public List getOwners() {
        return owners;
    }
    public HashMap getDb() {
        return db;
    }
}
