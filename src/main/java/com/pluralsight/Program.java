package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();
        House house1 = new House("45 Lampkin Lane", 1, 1800, 2);
        House house2 = new House("1428 Elm Street", 3, 2000, 5);
        Vehicle vehicle1= new Vehicle("Ford Mustang",2005,125000);
        Vehicle vehicle2= new Vehicle("Micheal Myers car","10-15-2025",90000,"Bmw M5",2025,1000);

        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        for (Asset asset:assets){

//            System.out.println(asset);

            String message = "---------";
            if (asset instanceof House) {
                House house = (House) asset;
                message = "House at " + house.getAddress();
            }
            else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                message = "Vehicle: " +
                        vehicle.getYear() + " " + vehicle.getMakeModel();
                message += String.format("  Estimated Value: $%,.2f", asset.getValue());

            }
            System.out.println(message);

        }




    }
}
