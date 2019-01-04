package juan_mao.bwie.com.proxysample.factory;

/**
 * Created by 卷猫~ on 2019/1/4.
 */

class LuhuCar extends Car {
    private String name;

    @Override
    public String toString() {
        return "LuhuCar{" +
                "name='" + name + '\'' +
                '}';
    }

    public LuhuCar(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
