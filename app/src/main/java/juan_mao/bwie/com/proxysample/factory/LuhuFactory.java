package juan_mao.bwie.com.proxysample.factory;

/**
 * Created by 卷猫~ on 2019/1/4.
 */

public class LuhuFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new LuhuCar("路虎");
    }

    @Override
    public EngineOil createEngineOil() {
        return new LuHuEngineOil("路虎的机油哈哈哈");
    }
}
