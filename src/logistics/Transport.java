package logistics;

// интерфейс для всех видов транспорта
public interface Transport {
    void deliver(String cargo, String destination);
}