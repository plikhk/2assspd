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
