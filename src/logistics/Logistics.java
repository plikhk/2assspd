package logistics;

public abstract class Logistics {
    public abstract Transport createTransport();

    public void publicDelivery(String cargo, String destination) {
        Transport transport = createTransport();
        transport.deliver(cargo, destination);
    }
}
