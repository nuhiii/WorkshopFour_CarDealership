package com.ps;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
       init();
    }

    private void init() {
        this.dealership = new DealershipFileManager().getDealership("inventory.txt");
    }

    public void display() {
        init();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            System.out.print("Please enter your selection: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Exiting Application... Thank You!");
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (choice != 0);
    }

    private void displayMenu() {
        System.out.println("1 - Find by price");
        System.out.println("2 - Find by make / model");
        System.out.println("3 - Find by year");
        System.out.println("4 - Find by color");
        System.out.println("5 - Find by mileage");
        System.out.println("6 - Find by type");
        System.out.println("7 - Show ALL vehicles");
        System.out.println("8 - Add vehicle");
        System.out.println("9 - Remove vehicle");
        System.out.println("0 - Quit");
    }

    private void processGetByPriceRequest() {}
    private void processGetByMakeModelRequest() {}
    private void processGetByYearRequest() {}
    private void processGetByColorRequest() {}
    private void processGetByMileageRequest() {}
    private void processGetByVehicleTypeRequest() {}
    private void processAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }
    // Helper Method for processAllVehiclesRequest() to display ALL vehicles
    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("VIN: " + vehicle.getVin() + ", Year: " + vehicle.getYear() + ", Make: " + vehicle.getMake() +
                    ", Model: " + vehicle.getModel() + ", Type: " + vehicle.getVehicleType() + ", Color: " + vehicle.getColor() +
                    ", Mileage: " + vehicle.getOdometer() + ", Price: $" + vehicle.getPrice());
        }
    }
    private void processAddVehicleRequest() {}
    private void processRemoveVehicleRequest() {}
}
