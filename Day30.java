/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day30;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
        System.out.println("masukkan nilai n-nya: ");
        int n = serli.nextInt();

        for (int j = 0; j <= n; j++) {
            if (j % 3 == 0) {
                System.out.println(j);

            }
        }
    }
}
