//Abstraction and Inheritance
abstract class usabilityCondition extends vehicles {

    //constructor
    public usabilityCondition(String firstVehicle, String secondVehicle) {
        super(firstVehicle, secondVehicle);
    }

    //Regular method
    public void firstHand(){
        System.out.println(getFirstVehicle() + " is a new model");
    }

    public void secondHand(){
        System.out.println(getSecondVehicle() + " is a second hand model");
    }

    public void localVehicle(){
        System.out.println(getFirstVehicle() + " is a local model");
    }

    public void remoteVehicle(){
        System.out.println(getSecondVehicle() + " is a imported model");
    }  

    //Abstract method
    public abstract void abstractMethod();   

    @Override
    public void setFirstVehicle(String firstVehicle) {
        super.setFirstVehicle(firstVehicle);
        System.out.println(getFirstVehicle());
    }

    @Override
    public void setSecondVehicle(String secondVehicle) {
        super.setSecondVehicle(secondVehicle);
        System.out.println(getSecondVehicle());
    }
}

