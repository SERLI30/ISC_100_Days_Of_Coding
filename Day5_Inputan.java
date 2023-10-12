/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day5_inputan;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Day5_Inputan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner serli = new Scanner(System.in);
        System.out.println("masukkan nomor peserta anda: ");
        String nomorpeserta= serli.nextLine();
        System.out.println("masukkan nama anda: ");
        String nama = serli.nextLine();
        System.out.println("masukkan jenis kelamin anda: ");
        String jeniskelamin = serli.nextLine();
        System.out.println("masukkan umur anda: ");
        double umur = serli.nextDouble();
        System.out.println("masukkan berat badan anda: ");
        double beratbadan = serli.nextDouble();
        System.out.println("masukkan aktifan anda: ");
        boolean aktifan = serli.nextBoolean();
        
        System.out.println("nomor peserta anda  : " + nomorpeserta);
        System.out.println("nama anda: " + nama);
        System.out.println("jenis kelamin anda : " + jeniskelamin);
        System.out.println("umur anda : " + umur);
        System.out.println("berat badan anda : " + beratbadan);
        System.out.println("aktifan anda : " + aktifan);
        
    }
    
}
