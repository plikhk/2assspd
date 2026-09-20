package logistics;

public class Truck {
    @Override
    public void deliver(String cargo, String destination){
        System.out.println("Truck delivers" + cargo + "to" + destination);
    }
}
