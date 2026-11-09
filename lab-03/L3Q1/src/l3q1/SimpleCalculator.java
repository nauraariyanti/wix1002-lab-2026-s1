/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Enter the operand: ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: division by zero");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Error: division by zero");
                } else {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid operand");
        }

        input.close();
    }
}