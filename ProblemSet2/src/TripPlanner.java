/*@file TripPlanner.java
 * @brief Using JavaScript to create a trip planner using the user's input.
 * @author Sara Barker
 * @date 9/11/2018
 */

import java.util.Scanner;

public class TripPlanner {

        //variable declarations

    public static void main(String[] args) {
        int passengers;
        double length;
        double feul_Capacity;
        double gas_Price;
        double miles_Gallon;
        double travel;
        double travel_Rounded;

        Scanner scnr = new Scanner(System.in);

        //asking user

        System.out.println("Welcome to Trip Planner!");
        System.out.println("Please enter number of passengers in the car:");
        passengers = scnr.nextInt();

        System.out.println("Please enter the length of the trip in miles:");
        length = scnr.nextDouble();

        System.out.println("Please enter the capacity of the fuel tank:");
        feul_Capacity = scnr.nextDouble();

        System.out.println("Please enter the price of the gas per gallon:");
        gas_Price = scnr.nextDouble();

        System.out.println("Please enter the car's miles per gallon:");
        miles_Gallon = scnr.nextDouble();

        scnr.nextLine();

        //calculations & outputs

        System.out.println("The number of tanks of gas needed for your trip:");
        double travel1 = length/(miles_Gallon * feul_Capacity);
        double travel_Rounded1 = Math.ceil(travel1);
        System.out.println(travel_Rounded1);

        System.out.println("The total price of the gas needed:");
        double travel2 = (feul_Capacity * travel_Rounded1) * gas_Price;
        System.out.println(travel2);

        System.out.println("The price per passenger when cost is split evenly:");
        double travel3 = (travel2 / passengers);
        System.out.println(travel3);

    }
}