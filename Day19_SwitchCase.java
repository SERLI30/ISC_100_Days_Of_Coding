/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day19_switchcase;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day19_SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner serli = new Scanner(System.in);
    char nilai;
        System.out.println("input nilai mahasiswa (A - D): ");
        nilai = serli.next().charAt(0);
        switch (nilai){
            case 'A' :
                System.out.println("SANGAT BAIK!!");
                break;
            case 'B' :
                System.out.println("BAIK!");
                break;
            case 'C' : 
                System.out.println("CUKUP");
                break;
            case 'D' :
                System.out.println("BURUK");
                break;
                
        }
    }
    
}
