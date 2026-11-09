/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package l2q6;

import java.util.Scanner;

public class WaterHeating {
    public static void main(String[] args) {
        final double SPECIFIC_HEAT = 4184;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        double grams = scanner.nextDouble();

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialF = scanner.nextDouble();

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalF = scanner.nextDouble();

        double m = grams / 1000;
        double initialC = (initialF - 32) / 1.8;
        double finalC = (finalF - 32) / 1.8;

        double q = m * (finalC - initialC) * SPECIFIC_HEAT;

        System.out.printf("The energy needed is %e\n", q);

        scanner.close();
    }
}