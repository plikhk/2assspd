package app;

import gui.Button;
import gui.Checkbox;
import gui.GUIFactory;
import logistics.Logistics;

// клиент работает только с интерфейсами
public class DeliveryApplication {
    private final Button button;
    private final Checkbox checkbox;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory factory, Logistics logistics) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
        this.logistics = logistics;
    }

    public void execute(String cargo, String destination) {
        button.paint();
        checkbox.paint();
        logistics.planDelivery(cargo, destination);
    }
}