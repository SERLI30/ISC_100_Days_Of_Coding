/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day4_inputan;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Day4_Inputan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Serli = new Scanner (System.in);
    String nama;
    String nim;
    String kelas;
        System.out.println("nama: ");
        nama = Serli.nextLine();
        System.out.println("nim: ");
        nim = Serli.nextLine();
        System.out.println("kelas: ");
        kelas = Serli.nextLine();
        
        System.out.println("nama saya: " + nama);
        System.out.println("nim saya: " + nim);
        System.out.println("kelas saya: " + kelas);
    
    }
    
}
