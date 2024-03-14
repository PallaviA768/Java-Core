package com.learning.core.day1;

interface MedicineInfo {
    void displayLabel();
}

class Tablet implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Store in a cool, dry place.");
    }
}

class Syrup implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Shake well before use.");
    }
}

class Ointment implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("For external use only.");
    }
}

public class D01P02 {
    public static void main(String[] args) {
        MedicineInfo tablet = new Tablet();
        MedicineInfo syrup = new Syrup();
        MedicineInfo ointment = new Ointment();

        // Polymorphic behavior
        System.out.println("Tablet label:");
        tablet.displayLabel();

        System.out.println("Syrup label:");
        syrup.displayLabel();

        System.out.println("Ointment label:");
        ointment.displayLabel();
    }
}
