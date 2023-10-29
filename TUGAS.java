/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TUGAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a > b){
            System.out.println("a lebih besar dari b");
    }else{
            System.out.println("a tidak lebih besar dari b");
        }
        if (a < 15 || b > 25){
            System.out.println("a kurang dari 15 atau b lebih besar dari 25");
        }else{
            System.out.println("a tidak kurang dari 15 atau b tidak kurang besar dari 25 ");
        }
        int hasiloperasi = a | b;
        System.out.println("hasil dari a dan b: " + hasiloperasi);
        Scanner serli = new Scanner(System.in);
        System.out.println("masukkan nilai x: ");
        int x = serli.nextInt();
        System.out.println("masukkan nilai y: ");
        int y = serli.nextInt();
        if (x > y){
            System.out.println("x lebih besar dari y");
        }else{
            System.out.println("x tidak lebih besar/kecil dari y");
            
        double pangkat=Math.pow(x, y);
            System.out.println("hasil dari" + x + "pangkat" + y + "adalah" + pangkat);
        double ratarata = (x + y) /2.0; 
            System.out.println("rata-rata dari" + x + "dan" + y + "adalah" + ratarata);
            System.out.println("program selesai");
        }
    }
    
    
}
