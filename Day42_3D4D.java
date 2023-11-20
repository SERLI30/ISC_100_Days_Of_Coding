/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day42_3d4d;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day42_3D4D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner serli = new Scanner(System.in);
        System.out.print("ukuran matriks 1: ");
        int a = serli.nextInt();
        System.out.print("ukuran matriks 2: ");
        int r = serli.nextInt();
        System.out.print("ukuran matriks 3: ");
        int f = serli.nextInt();
        System.out.print("ukuuran matriks 4: ");
        int h = serli.nextInt();
        int[][][][]array=new int[a][r][f][h];
        Random s = new Random( );
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < f; k++) {
                    for (int l = 0; l < h; l++) {
                        array[i][j][k][l]=s.nextInt(100);
                    }
                    
                }
                
            }
            
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < f; k++) {
                    for (int l = 0; l < h; l++) {
                        System.out.print(array[i][j][k][l] + " ");
            
        }
                    System.out.println();
    }
                System.out.println();    
}}}}
