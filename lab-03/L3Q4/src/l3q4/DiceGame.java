/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();

        // Player 1 rolls twice
        int p1Roll1 = rand.nextInt(6) + 1;
        int p1Roll2 = rand.nextInt(6) + 1;
        int p1Total = p1Roll1 + p1Roll2;

        // Player 2 rolls twice
        int p2Roll1 = rand.nextInt(6) + 1;
        int p2Roll2 = rand.nextInt(6) + 1;
        int p2Total = p2Roll1 + p2Roll2;

        System.out.println("Player 1 rolled " + p1Roll1 + " and " + p1Roll2 + " = " + p1Total);
        System.out.println("Player 2 rolled " + p2Roll1 + " and " + p2Roll2 + " = " + p2Total);

        if (p1Total > p2Total) {
            System.out.println("Player 1 wins!");
        } else if (p2Total > p1Total) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}