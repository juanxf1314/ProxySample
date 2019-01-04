package juan_mao.bwie.com.proxysample;

import android.util.Log;

/**
 * 代理房东 == 中介
 * 静态代理，需要自己写一个代理类
 * Created by 卷猫~ on 2019/1/4.
 */

public class ProxyLandlord implements IRentRoom {

    private static final String TAG = "ProxyLandlord";
    Landlord landlord = new Landlord();

    // 提供一个房源给北漂
    @Override
    public Room rent() {
        Room rent = landlord.rent();
        Log.d(TAG, "帮你修理损坏的水管");
        return rent;
    }
}
