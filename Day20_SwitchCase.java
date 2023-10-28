/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Day20_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day20_SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner serli = new Scanner(System.in);
     int a,b,pilih;
     double a1,t,z;
        System.out.println("MENGHITUNG LUAS");
        System.out.println("1. menghitung luas persegi");
        System.out.println("2. menghitung luas segitiga");
        System.out.println("3. menghitung luas persegi panjang");
        System.out.println("4. menghitung luas lingkaran");
        System.out.println("pilih angka untuk memilih");
        System.out.println("pilih luas: ");
        pilih = serli.nextInt();
        switch(pilih){
            case 1:
                System.out.println("sisi persegi: ");
                int s = serli.nextInt();
                System.out.println("sisi persegi: ");
                int s1 = serli.nextInt();
                int e = s*s1;
                System.out.println("luas persegi: " + e);
                break;
                        
            case 2: 
                System.out.println("masukkan alas: ");
                a = serli.nextInt();
                System.out.println("masukkan tinggi: ");
                t = serli.nextInt();
                z = (a*t)/ 0.5;
                System.out.println("luas segitiga: " + z);
                break;
                
            case 3:
                System.out.println("masukkan jari-jari: ");
                a1 = serli.nextInt();
                z = a1*a1*3.14;
                System.out.println("luas lingkaran: " + z);
                
            case 4:
                System.out.println("masukkan panjang: ");
                int p = serli.nextInt();
                System.out.println("masukkan lebar: ");
                int l = serli.nextInt();
                int u = p*l;
                System.out.println("luas persegi panjang: " + u);
                break;
        }
    }
}
