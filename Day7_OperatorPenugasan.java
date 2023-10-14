/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day7_operatorpenugasan;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Day7_OperatorPenugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nilai = 78;
    int nilai1 = 90;
    int nilai2 = 77;
    int nilai3 = 80;
        System.out.println("nilai: " + nilai);
        System.out.println("nilai1: " + nilai1);
        System.out.println("nilai2: " + nilai2);
        System.out.println("nilai3" + nilai3);
        nilai*=nilai1/nilai2%nilai3;
        System.out.println("hasil: " + nilai * nilai1 / nilai2 % nilai3);
    }
    
}
