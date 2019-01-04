package juan_mao.bwie.com.proxysample;

/**
 * Created by 卷猫~ on 2019/1/4.
 */

public class Room {
    private int price;

    @Override
    public String toString() {
        return "Room{" +
                "price=" + price +
                '}';
    }

    public Room(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
