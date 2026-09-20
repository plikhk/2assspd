package logistics;

public class SeaLogstics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
