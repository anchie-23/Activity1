package activity6;

import java.util.Scanner;

public class Activity6{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Distance (km): ");
        double distance = scanner.nextDouble();

        System.out.println("Select class: ");
        System.out.println("1: Economy class");
        System.out.println("2: Business class");
        System.out.print("Class: ");
        int travelClass = scanner.nextInt();

        double baseFarePerKm = 0;

        if (travelClass == 1) {
            baseFarePerKm = 250;
        } else if (travelClass == 2) {
            baseFarePerKm = 500;
        } else {
            System.out.println("Invalid class");
            scanner.close();
            return;
        }

        double totalFare = distance * baseFarePerKm;

        if (distance > 1000) {
            totalFare = totalFare * 0.9; // 10% discount
        }

        System.out.printf("Total fare: %.2f\n", totalFare);

        scanner.close();
    }
}