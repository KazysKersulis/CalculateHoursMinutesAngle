package com.company.anglecalculator;

import java.util.Scanner;

public class AngleCalculator {

    private static Scanner sc = new Scanner(System.in);

    public static void startProgram() {

        System.out.println("Please enter hours: ");
        String stringHours = sc.nextLine();
        int hours = convertToInt(stringHours);

        System.out.println("Now please enter minutes: ");
        String stringMinutes = sc.nextLine();
        int minutes = convertToInt(stringMinutes);

        System.out.println("The angle between hours and minutes is " +
                calculateAngle(hours, minutes));
    }

    public static double calculateAngle(int hours, int minutes) {

        if (hours == 12) { hours = 0; }

        if (hours < 0 || minutes < 0 || hours > 12 || minutes > 59) {
            System.out.println("Input is invalid");
            return 0;
        } else {
            double h_angle = (0.5 * (60 * hours + minutes));
            double m_angle = 6 * minutes;

            double angle = Math.abs(h_angle - m_angle);

            angle = Math.min(360-angle, angle);

            return angle;
        }
    }

    private static int convertToInt(String value){

        int intValue = 0;
        try{
            intValue = Integer.parseInt(value);
        }catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please try again!");
            String stringHours = sc.nextLine();
            intValue = convertToInt(stringHours);
        }

        return intValue;
    }
}
