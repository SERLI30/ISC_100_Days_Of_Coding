/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day12_operatoraritmatika;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day12_OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner serli = new Scanner (System.in);
    int A,B,jumlahkemeja,jumlahkotak,jumlahkotakterisi,sisakemejayangbelumterisi;
        System.out.println("JUMLAH: ");
        A = serli.nextInt();
        System.out.println("JUMLAH1: ");
        B = serli.nextInt();
        jumlahkemeja = A + B;
        jumlahkotak = A + B;
        jumlahkotakterisi = A - B;
        sisakemejayangbelumterisi = A - B;
        
        
        System.out.println("jumlah kemeja: " + jumlahkemeja);
        System.out.println("jumlah kotak: " + jumlahkotak);
        System.out.println("jumlah kotak terisi: " + jumlahkotakterisi);
        System.out.println("sisa kemeja yang belum terisi: " + sisakemejayangbelumterisi);
    }
    
}
