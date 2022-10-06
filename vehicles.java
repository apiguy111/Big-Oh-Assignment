//Encapsulation
public class vehicles {
    private String firstVehicle;
    private String secondVehicle;

    //constructor for vehicles
    public vehicles(String firstVehicle, String secondVehicle) {
        this.firstVehicle = firstVehicle;
        this.secondVehicle = secondVehicle;
    }

    //Getter
    public String getFirstVehicle() {
        return firstVehicle;
    }

    //Setter
    public void setFirstVehicle(String firstVehicle) {
        this.firstVehicle = firstVehicle;
    }

    //Getter
    public String getSecondVehicle() {
        return secondVehicle;
    }

    //Setter
    public void setSecondVehicle(String secondVehicle) {
        this.secondVehicle = secondVehicle;
    }
}
