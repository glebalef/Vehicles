import java.sql.SQLOutput;

public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void check() {
        super.check();
        this.checkEngine();
        this.checkTrailer();

    }
}





