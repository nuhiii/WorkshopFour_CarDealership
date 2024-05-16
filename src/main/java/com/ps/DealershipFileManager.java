package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DealershipFileManager {

    public Dealership getDealership(String filePath) {
        Dealership dealership = null;
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(filePath));
            // Process first line containing dealership info
            String dealershipLine = buffReader.readLine();
            if (dealershipLine != null) {
                String[] dealershipData = dealershipLine.split("\\|");
                String name = dealershipData[0];
                String address = dealershipData[1];
                String phone = dealershipData[2];
                dealership = new Dealership(name, address, phone);

                // Interpret rest of lines with the vehicle data
                String vehicleLine;
                while ((vehicleLine = buffReader.readLine()) != null) {
                    String[] vehicleData = vehicleLine.split("\\|");
                    int vin = Integer.parseInt(vehicleData[0]);
                    int year = Integer.parseInt(vehicleData[1]);
                    String make = vehicleData[2];
                    String model = vehicleData[3];
                    String vehicleType = vehicleData[4];
                    String color = vehicleData[5];
                    int odometer = Integer.parseInt(vehicleData[6]);
                    double price = Double.parseDouble(vehicleData[7]);

                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(vehicle);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dealership;
    }

    // As stated this method will overwrite the file with the current dealership info and inventory list
    public void saveDealership(Dealership dealership, String filePath) {
        try {
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter(filePath));
            // Write the first line with the dealership info
            buffWriter.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());
            buffWriter.newLine();

            // Write the next lines with the vehicle data
            for (Vehicle vehicle : dealership.getAllVehicles()) {
                buffWriter.write(vehicle.getVin() + "|" + vehicle.getYear() + "|" +
                        vehicle.getMake() + "|" + vehicle.getModel() + "|" +
                        vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" +
                        vehicle.getOdometer() + "|" + vehicle.getPrice());
                buffWriter.newLine();
            }
            buffWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
