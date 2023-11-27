/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day50;

import java.util.Arrays;
import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
   Scanner serli = new Scanner(System.in);
        System.out.print("masukkan angka: ");
   int a = serli.nextInt();
   int sum =0;
   int[] b = new int[a];
        for (int i = 1; i < a; i++) {
            b[i]=i;
            sum +=1;
            
        }
        System.out.print(Arrays.toString(b));
        System.out.println("="+ sum);
        System.out.println();
    }
    
}
