package com.company.anglecalculator;

import java.util.Scanner;

public class AngleCalculator {

    private static Scanner sc = new Scanner(System.in);

    public static void startProgram() {

        System.out.println("Please enter hours: ");
        int hours = sc.nextInt();

        System.out.println("Now please enter minutes: ");
        int minutes = sc.nextInt();

        if(validateInput(hours, minutes)) {
            calculateAngle(hours, minutes);
        } else {
            System.out.println("Input is invalid. Hours must be 0-12 and minutes 0-59");
        }
    }

    private static boolean validateInput(int hours, int minutes) {

        boolean isValid = false;

        if (hours < 0 || minutes < 0 || hours > 12 || minutes > 59) {
            return isValid;
        } else {
            return isValid = true;
        }
    }

    public static void calculateAngle(int hours, int minutes) {

        if (hours == 12) { hours = 0; }

        if (minutes == 60) { minutes = 0; }

    }

}
