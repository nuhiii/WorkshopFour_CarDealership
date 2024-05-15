package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {

    public Dealership getDealership(String filePath) {
        Dealership dealership = null;
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(filePath));
            // Process and consume first line containing dealership info
            String dealershipInfo = buffReader.readLine();
            if (dealershipInfo != null) {
                String[] dealershipData = dealershipInfo.split("\\|");
                String name = dealershipData[0];
                String address = dealershipData[1];
                String phone = dealershipData[2];
                dealership = new Dealership(name, address, phone);

                // Interpret rest of lines with the vehicle data
                String line;
                while ((line = buffReader.readLine()) != null) {
                    String[] vehicleData = line.split("\\|");
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

    public void saveDealership(Dealership dealership, String filePath) {
    }

}
