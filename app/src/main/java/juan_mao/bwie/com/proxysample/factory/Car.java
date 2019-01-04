package juan_mao.bwie.com.proxysample.factory;

/**
 * Created by 卷猫~ on 2019/1/4.
 */

public class Car {
    private String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(String name) {
        this.name = name;
    }
}
