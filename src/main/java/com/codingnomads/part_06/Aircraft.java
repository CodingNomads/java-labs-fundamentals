package com.codingnomads.part_06;

public class Aircraft {
    public static void main(String[] args) {

        FighterJet fighterJet = new FighterJet(2, 45,3, 2, 8);
        PassangerPlane passangerPlane = new PassangerPlane(4,75,5,300, 10000);
        CargoPlane cargoPlane1 = new CargoPlane(4,100, 5,0, 20000,true);

        System.out.println(fighterJet.toString());
        System.out.println(passangerPlane.toString());
        System.out.println(cargoPlane1.toString());

        fighterJet.fuelUp(5000);
        passangerPlane.fuelUp(10000);
        cargoPlane1.fuelUp(15000);

        System.out.println("Fighter Jet Fuel = " + fighterJet.showFuel());
        System.out.println("Passanger Jet Fuel = " + passangerPlane.showFuel());
        System.out.println("Cargo Jet Fuel = " + cargoPlane1.showFuel());

        CargoPlane cargoPlane2 = new CargoPlane(2,75,3,15000,0,20000,false);
        System.out.println(cargoPlane2.toString());

        System.out.println("Fuel = " + cargoPlane2.showFuel());
        cargoPlane2.landing();

    }
}
