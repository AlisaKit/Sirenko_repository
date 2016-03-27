/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.homework03;

import static uits.jv1601.homework03.Task2.rand;

/**
*
* @author Admin
*/
public class Manipulation {

public static void summa(int[][] m1, int[][] m2) {
    int summa;
    System.out.println("Summa");
    for (int i = 0; i < m1.length; i++) {
        for (int j = 0; j < m2.length; j++) {
            summa = m1[i][j] + m2[i][j];
            System.out.print(summa + " ");
        }
        System.out.println();

    }
}

public static void multiplication(int[][] m1, int[][] m2) {
    int m[][] = new int[m1.length][m2.length];
    System.out.println("Multiplication:");
    for (int i = 0; i < m1.length; i++) {
        for (int j = 0; j < m2.length; j++) {
            for (int r = 0; r < m1.length; r++) {
                m[i][j] += m1[i][r] * m2[r][j];

            }
            System.out.print(m[i][j] + " ");
        }
        System.out.println();
    }
}

public static void randomNumbers(int[][] m1, int[][] m2) {
    int n = rand.nextInt(10);
    System.out.println("Number: " + n);
    int counter;
    System.out.println("Multiplication of random number for first array");
    for (int i = 0; i < m1.length; i++) {  //for first array
        for (int j = 0; j < m1[i].length; j++) {
            counter = m1[i][j] * n;
            System.out.print(counter + " ");

        }
        System.out.println();
    }
    System.out.println("Multiplication of random number for second array");
    for (int i = 0; i < m2.length; i++) {  //for second array
        for (int j = 0; j < m2[i].length; j++) {
            counter = m2[i][j] * n;
            System.out.print(counter + " ");

        }
        System.out.println();
    }
}

public static void transposition(int[][] m1, int[][] m2) {
    System.out.println("Transposition matrix one: ");
    int trans[][] = new int[m1.length][m2.length];
    for (int i = 0; i < m1.length; i++) {
        for (int j = 0; j < m1.length; j++) {
            trans[i][j] = m1[j][i];
            System.out.print(trans[i][j] + " ");

        }
        System.out.println();
    }
    System.out.println("Transposition matrix two: ");
    for (int i = 0; i < m2.length; i++) {
        for (int j = 0; j < m2.length; j++) {
            trans[i][j] = m2[j][i];
            System.out.print(trans[i][j] + " ");

        }
        System.out.println();
    }
}
}
