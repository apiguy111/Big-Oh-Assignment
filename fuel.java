//Inheritance
public class fuel extends usabilityCondition {

    //Constructor
    public fuel(String firstVehicle, String secondVehicle){
        super(firstVehicle, secondVehicle);
    }

    public void diesel() {
        System.out.println(getFirstVehicle() + " runs on diesel");
    }

    public void petrol() {
        System.out.println(getSecondVehicle() + "runs on petrol");
    }

    public void abstractMethod(){
        System.out.println("Abstract method ");
    }
}

