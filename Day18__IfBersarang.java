/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day18__ifbersarang;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day18__IfBersarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner serli = new Scanner(System.in);
        System.out.println("masukkan usia");
        int usia = serli.nextInt();
        if(usia >= 20){
            System.out.println("dewasa");
        } else {
            if(usia >= 15){
                System.out.println("remaja");
        }else{
                System.out.println("anak-anak");
            }
        }
        
    }
    
}
