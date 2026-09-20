package app;

import gui.GUIFactory;
import gui.MacOSFactory;
import gui.WindowsFactory;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogstics;

import java.util.Scanner;

// точка входа с валидацией ввода
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Delivery mode (ROAD or SEA): ");
        String mode = scanner.nextLine().trim().toUpperCase();

        System.out.println("UI platform (WINDOWS or MACOS): ");
        String platform = scanner.nextLine().trim().toUpperCase();

        Logistics logistics = null;
        if (mode.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else if (mode.equals("SEA")) {
            logistics = new SeaLogstics();
        } else {
            System.out.println("error unsupported delivery mode");
            return;
        }

        GUIFactory factory = null;
        if (platform.equals("WINDOWS")) {
            factory = new WindowsFactory();
        } else if (platform.equals("MACOS")) {
            factory = new MacOSFactory();
        } else {
            System.out.println("error unsupported platform");
            return;
        }

        DeliveryApplication app = new DeliveryApplication(factory, logistics);
        app.execute("laboratory equipment", "Aktau warehouse");
    }
}