# 2assspd
# Logistics & Cross-Platform UI Application (Assignment 2)

**Course:** ShP-2216 Software Design Patterns  
**University:** Astana IT University  
**Programme:** 6B06102 Software Engineering | Group SE-2524  
**Instructor:** Yerassyl Bekenov  

---

## 📌 Project Purpose
This Java console application demonstrates the integration of two fundamental creational design patterns:
1. **Factory Method:** Decouples the delivery logistics workflow from concrete transport implementations (`Truck`, `Ship`).
2. **Abstract Factory:** Enforces consistency when instantiating matching cross-platform UI component families (`Windows` and `macOS` buttons & checkboxes).

The client code (`DeliveryApplication`) interacts exclusively with abstract interfaces and base classes, complying with Clean Code principles (Chapter 6: Data Abstraction and Object Encapsulation).

---

## 📁 Package Structure

```text
src/
├── app/
│   ├── DeliveryApplication.java  # Client application coordinating UI and Logistics
│   └── Main.java                 # Entry point with input validation and setup
├── gui/
│   ├── Button.java               # Button product contract
│   ├── Checkbox.java             # Checkbox product contract
│   ├── GUIFactory.java           # Abstract factory contract
│   ├── MacOSButton.java          # macOS concrete button
│   ├── MacOSCheckbox.java        # macOS concrete checkbox
│   ├── MacOSFactory.java         # Concrete factory for macOS family
│   ├── WindowsButton.java        # Windows concrete button
│   ├── WindowsCheckbox.java      # Windows concrete checkbox
│   └── WindowsFactory.java       # Concrete factory for Windows family
└── logistics/
    ├── Logistics.java            # Abstract creator class with shared workflow
    ├── RoadLogistics.java        # Concrete creator for road transport
    ├── SeaLogistics.java         # Concrete creator for sea transport
    ├── Ship.java                 # Sea transport product
    ├── Transport.java            # Transport product contract
    └── Truck.java                # Road transport product


🛠️ PrerequisitesJava Development Kit (JDK): Version 17 or higher.IDE: IntelliJ IDEA (recommended) or any standard Java IDE / terminal.🚀 How to Build and RunOption 1: IntelliJ IDEA (Recommended)Open the project folder in IntelliJ IDEA.Ensure the SDK is set to JDK 17 (File -> Project Structure -> Project).Navigate to src/app/Main.java.Right-click Main.java and select Run 'Main.main()' (or press Shift + F10).Option 2: Command Line Interface (CLI)Open terminal in the root project directory (2assspd).Compile all Java source files into an out folder:Bashjavac -d out src/logistics/*.java src/gui/*.java src/app/*.java
Run the application:Bashjava -cp out app.Main
⚙️ Supported Input ValuesWhen prompted, enter one value for delivery mode and one value for UI platform (case-insensitive):CategoryValid InputsDescriptionDelivery ModeROADUses Truck for land transportationSEAUses Ship for maritime transportationUI PlatformWINDOWSRenders WindowsButton and WindowsCheckboxMACOSRenders MacOSButton and MacOSCheckboxNote: Entering invalid values (e.g., AIR or LINUX) will trigger input validation, display an error message, and safely terminate execution.💻 Sample RunConsole Interaction:PlaintextDelivery mode (ROAD or SEA): 
ROAD
UI platform (WINDOWS or MACOS): 
WINDOWS
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse

Process finished with exit code 0

### Что дальше:
1. Закоммить этот `README.md` в гите (`git add README.md`, `git commit -m "docs: add comprehensive README"`, `git push`)[cite: 1].
2. Убедись, что на GitHub в главном меню репозитория этот README красиво отображается внизу[cite: 1].
