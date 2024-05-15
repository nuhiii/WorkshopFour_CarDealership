package com.ps;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new DealershipFileManager().getDealership("inventory.txt");

        if (dealership != null) {
            System.out.println("Dealership: " + dealership.getName());
            for (Vehicle v : dealership.getAllVehicles()) {
                System.out.println("VIN: " + v.getVin() + ", Make: " + v.getMake() + ", Model: " + v.getModel());
            }
        } else {
            System.out.println("Failed to load dealership data.");
        }
    }
}