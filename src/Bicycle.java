public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

 @Override
 public void check (Vehicle vehicle) {
     super.check(this);
     }
 }



