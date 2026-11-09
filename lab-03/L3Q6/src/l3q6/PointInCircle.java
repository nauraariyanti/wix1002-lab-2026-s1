/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        System.out.print("Enter the point (x, y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance < radius) {
            System.out.println("Point (" + x + ", " + y + ") is inside the circle");
        } else if (distance == radius) {
            System.out.println("Point (" + x + ", " + y + ") is on the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is outside the circle");
        }

        input.close();
    }
}