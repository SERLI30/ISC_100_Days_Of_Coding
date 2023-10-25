/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day17__ifelse;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day17__IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner serli = new Scanner(System.in);
    float jam;
        System.out.print("masukkan jam: ");
        jam = serli.nextFloat();
        
        if(jam >= 05.00 && jam <10.00){
        System.out.println("pagi");
    }else if(jam >= 11.00 && jam <= 13.00){
            System.out.println("siang");
    }else if(jam >= 14.00 && jam <= 18.00){
            System.out.println("sore");   
    }else if(jam >= 19.00 && jam <= 24.00){
            System.out.println("malam");
    }else if(jam >= 01.00 && jam <= 04.00){
            System.out.println("dini hari");
    }
    }
    
}
