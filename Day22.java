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
        int hasil = angka % 2 != 0 ? angka + 1 : angka + 2;
        String kondisi = hasil % 2 == 0 ? "adalah bilangan genap" : "adalah bilangan ganjil";
        System.out.println(kondisi);
    }
    }
    

