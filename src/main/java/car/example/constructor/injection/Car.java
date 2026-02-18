package car.example.constructor.injection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetail(){
        System.out.println("Car Details: "+specification.toString());
    }
}
