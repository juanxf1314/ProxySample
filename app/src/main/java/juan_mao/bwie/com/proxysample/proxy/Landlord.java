package juan_mao.bwie.com.proxysample.proxy;

/**
 * 房东
 * Created by 卷猫~ on 2019/1/4.
 */

public class Landlord implements IRentRoom {

    // 房东有一套房子
    Room room = new Room(2000);

    @Override
    public Room rent() {
        return room;
    }
}
