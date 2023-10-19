/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day11_operatorlogika;

/**
 *
 * @author HP
 */
public class Day11_OperatorLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean serli = true;
    boolean serli1 = false;
    boolean hasil;
    hasil = serli && serli;
        System.out.println("serli && serli: " + hasil);
    hasil = serli && serli1;
        System.out.println("serli && serli1: " + hasil);
    hasil = serli || serli;
        System.out.println("serli && serli: " + hasil);
    hasil = serli || serli1;
        System.out.println("serli || serli1: " + hasil);
    hasil = !serli;
        System.out.println("!serli: " + hasil);
    hasil = !serli1;
        System.out.println("!serli1: " + hasil);
    }
    
}
