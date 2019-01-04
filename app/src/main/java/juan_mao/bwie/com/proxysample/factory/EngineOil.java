package juan_mao.bwie.com.proxysample.factory;

/**
 * Created by 卷猫~ on 2019/1/4.
 */

public class EngineOil {
    private String name;

    @Override
    public String toString() {
        return "EngineOil{" +
                "name='" + name + '\'' +
                '}';
    }

    public EngineOil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
