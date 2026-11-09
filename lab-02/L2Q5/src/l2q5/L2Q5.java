/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

public class L2Q5 {

    public static void main(String[] args) {

        int number = (int)(Math.random() * 10001);

        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        System.out.println("Random number: " + number);
        System.out.println("Sum of all digits: " + sum);
    }
}