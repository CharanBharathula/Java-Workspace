package BackendCourse.Assignments.VehicleRening;

public class Car implements Rentable {

    public String cartModel;
    public boolean isRented;

    public Car(String carModel) {
        this.cartModel = carModel;
    }

    @Override
    public void rent() {
        if (isRented == false) {
            isRented = true;
            System.out.println("car is now rented");
        }
    }

    @Override
    public void returnItem() {
        if (isRented == true) {
            isRented = false;
            System.out.println("car is now returned");
        }

    }
}
