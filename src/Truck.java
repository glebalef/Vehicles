import java.sql.SQLOutput;

public class Truck extends Vehicle implements Engined,Trailered {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    }





