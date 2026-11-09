/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

import java.util.Scanner;

public class L2Q2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price of the car (P): ");
        double P = scanner.nextDouble();

        System.out.print("Enter down payment (D): ");
        double D = scanner.nextDouble();

        System.out.print("Enter interest rate (R) in %: ");
        double R = scanner.nextDouble();

        System.out.print("Enter loan duration (Y) in years: ");
        double Y = scanner.nextDouble();

        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);

        System.out.printf("Monthly payment: RM %.2f%n", M);

        scanner.close();
    }
}