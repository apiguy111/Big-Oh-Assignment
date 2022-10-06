public class main {

    public static void main(String[] args) {
        
        fuel sourabh = new fuel("Honda accord", "Ducati");
        System.out.println(sourabh.getFirstVehicle());
        System.out.println(sourabh.getSecondVehicle());
        sourabh.diesel();
        sourabh.petrol();
        sourabh.firstHand();
        sourabh.secondHand();
        sourabh.localVehicle();
        sourabh.remoteVehicle();
        sourabh.setFirstVehicle("BMW");
    }
}
