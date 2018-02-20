package com.company.anglecalculator;

import java.util.Scanner;

public class AngleCalculator {

    private static Scanner sc = new Scanner(System.in);

    public static void startProgram() {

        System.out.println("Please enter hours: ");
        int hours = sc.nextInt();

        System.out.println("Now please enter minutes: ");
        int minutes = sc.nextInt();

        System.out.println("The angle between hours and minutes is " + calculateAngle(hours, minutes));
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
}
