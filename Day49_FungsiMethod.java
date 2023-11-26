/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day49_fungsimethod;
public class Day49_FungsiMethod {
    public static void main(String[] args) {
    int nilai = 100;
    nilaihuruf(nilai);
    }
    public static void nilaihuruf(int nilaiangka){
        if(nilaiangka > 96){
            System.out.println("A");
        }else if(nilaiangka > 80){
            System.out.println("B");
        }else if(nilaiangka > 70){
            System.out.println("C");
        }else if(nilaiangka > 60){
            System.out.println("D");
        }else if(nilaiangka > 50){
            System.out.println("E");
        }
    }
}
