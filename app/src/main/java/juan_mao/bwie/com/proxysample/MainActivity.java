package juan_mao.bwie.com.proxysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rent(View view) {
        /**
         * 静态代理，需要自己new一个代理对象
         */
//        ProxyLandlord proxyLandlord = new ProxyLandlord();
//        Room room = proxyLandlord.rent();
//        Log.i(TAG, "我租到一个房子" + room.toString());

        /**
         * 动态生成的代理对象
         * Params1:被代理的类加载器;
         * Params2:被代理类的接口对象;
         * Params3:当代理对象的方法被调用的饿时候的回调监听
         */
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        // 代理对象
        IRentRoom iRentRoom = (IRentRoom) Proxy.newProxyInstance(Landlord.class.getClassLoader(), Landlord.class.getInterfaces(), myInvocationHandler);
        Room room = iRentRoom.rent();
        Log.i(TAG, "我租到一个房子" + room.toString());
    }

    class MyInvocationHandler implements InvocationHandler {
        // 房东
        Landlord landlord = new Landlord();

        @Override
        public Object invoke(Object o, Method method, Object[] args) throws Throwable {
            // 不是反射的话是我们自己这么调用的，也就是静态代理类里面是这么调用滴
            landlord.rent();
            // 这是通过反射的方式
            return method.invoke(landlord, args);
        }
    }
}
