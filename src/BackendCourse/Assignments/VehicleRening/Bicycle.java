package BackendCourse.Assignments.VehicleRening;

public class Bicycle implements Rentable {

    public String bicycleModel;
    public boolean isRented;

    public Bicycle(String bicycleModel) {
        this.bicycleModel = bicycleModel;
    }

    @Override
    public void rent() {
        if (isRented == false) {
            isRented = true;
            System.out.println("VehicleRenting.Bicycle is now rented");
        }
    }

    @Override
    public void returnItem() {
        if (isRented == true) {
            isRented = false;
            System.out.println("VehicleRenting.Bicycle is now returned");
        }
    }
}
