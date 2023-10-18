/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day9_operatorbitwise;

/**
 *
 * @author HP
 */
public class Day10_OperatorBitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int ser = 28;
    int li = 07;
    int hasil;
    hasil = ser & li;
        System.out.println("ser & li: " + hasil);
    hasil = ser | li;
        System.out.println("ser | li: " + hasil);
   hasil = ser ^ li;
        System.out.println("ser ^ li: " + hasil);
   hasil = ~li;
        System.out.println("~li: " + hasil);
   hasil = ser << 1;
        System.out.println("ser << 1:  " + hasil);
   hasil = li >> 2;
        System.out.println("li >> 2: " + hasil);
    }
    
}
