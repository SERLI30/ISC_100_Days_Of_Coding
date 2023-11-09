/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Day32PengenalanArray;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day32PengenalanArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[3];
        Scanner serli = new Scanner(System.in);
        System.out.println("masukkan bilangan ke-1: ");
        a[1]=serli.nextInt();
        System.out.println("masukkan bilangan ke-2: ");
        a[2]=serli.nextInt();
        System.out.println("hasilnya: ");
        System.out.println(a[1]+ "" +a[2]);
    }
    
}
