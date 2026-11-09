/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sales volume: ");
        double sales = input.nextDouble();

        double commission;

        if (sales <= 100) {
            commission = sales * 0.05;
        } else if (sales <= 500) {
            commission = sales * 0.075;
        } else if (sales <= 1000) {
            commission = sales * 0.10;
        } else {
            commission = sales * 0.125;
        }

        System.out.printf("The commission is %.2f%n", commission);

        input.close();
    }
}