/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day9__operatorlogika;

/**
 *
 * @author HP
 */
public class Day9__OperatorLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean ser = true;
    boolean li = false;
    boolean hasil;
        hasil = ser && ser;
        System.out.println("apakah hasil dari ser && ser: " + hasil);
        hasil = ser && li;
        System.out.println("apakah hasil dari ser && li: " + hasil);
        hasil = ser || ser;
        System.out.println("apakah hasil dari ser || ser: " + hasil);
        hasil = ser || li;
        System.out.println("apakah hasil dari ser || li: " + hasil);
        hasil = !ser;
        System.out.println("apakah hasil dari !ser: " + hasil);
        hasil = !li;
        System.out.println("apakah hasil dari !li: " + hasil);
    }
    
}
