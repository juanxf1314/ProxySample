package juan_mao.bwie.com.proxysample.factory;

/**
 * Created by 卷猫~ on 2019/1/4.
 */

public abstract class CarFactory {

    /*public static Car createCar(){
        return new Car("路虎");
    }*/
    public abstract Car createCar();

    // 早机油
    public abstract EngineOil createEngineOil();
}
