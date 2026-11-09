/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

public class L2Q3 {

    public static void main(String[] args) {

        int num1 = (int)(Math.random() * 41) + 10;
        int num2 = (int)(Math.random() * 41) + 10;
        int num3 = (int)(Math.random() * 41) + 10;

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);

        System.out.printf("Sum: %.2f%n", (double)sum);
        System.out.printf("Average: %.2f%n", average);
    }
}