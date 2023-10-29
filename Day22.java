/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day22;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner serli = new Scanner(System.in);
        System.out.println("masukkan angka: ");
        int angka = serli.nextInt();
        int hasil = angka % 5;
        String kondisi = hasil == 0 ? "adalah bilangan genap" : "adalah bilangan gan20jil";
        System.out.println(kondisi);
    }
    }
    

