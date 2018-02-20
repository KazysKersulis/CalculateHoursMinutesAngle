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

    public static int calculateAngle(int hours, int minutes) {

        if (hours == 12) { hours = 0; }

        int h_angle = (int)(0.5 * (60 * hours + minutes));
        int m_angle = 6 * minutes;

        int angle = Math.abs(h_angle - m_angle);

        angle = Math.min(360-angle, angle);

        return angle;

    }
}
