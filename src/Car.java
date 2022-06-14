public class Car extends Vehicle implements Engined {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("проверяем двигатель");
    }
    public void checkTrailer() {

    }
}

