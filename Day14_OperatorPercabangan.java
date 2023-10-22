/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day14_operatorpercabangan;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day14_OperatorPercabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner serli = new Scanner (System.in);
        System.out.println("bilangan a: ");
        double a = serli.nextDouble();
        System.out.println("bilngan b: ");
        double b = serli.nextDouble();
        System.out.println("bilangan c: ");
        double c = serli.nextDouble();
        if ( a == 56){
            System.out.println("true");
        }else if ( b != 78){
            System.out.println("false");
        }else if (c != 86){
            System.out.println("true");
        }
    }
    
}
