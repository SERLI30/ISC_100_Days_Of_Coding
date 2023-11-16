/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day39_arrays;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day39_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner serli = new Scanner(System.in);
        int s = serli.nextInt();
        int[]l =new int[s];
        int a = 0;
        int b = 5;
        
        for (int i = 0; i < l.length; i++) {
            if(s % 5 == 0){
                if(b% 5 == 0){
                    System.out.println(l[i]+b);
                    b++;
            
        }
                b++;
            }else if(s % 5 != 0){
                a++;
            if(a % 5 != 0)
                    System.out.println(l[i]+a);
            }
            a++;
//        
    }
    
    }}
