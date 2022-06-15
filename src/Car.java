public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        this.checkEngine();

    }
}



