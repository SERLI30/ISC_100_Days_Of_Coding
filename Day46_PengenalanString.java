/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day46_pengenalanstring;

import java.util.Arrays;
public class Day46_PengenalanString {
    public static void main(String[] args) {
    String judullagu = "TAK DIANGGAP";
    char[]kata={'T','A','K',' ','D','I','A','N','G','A','P'};
        System.out.println(judullagu);
        System.out.println(Arrays.toString(kata));
        System.out.println("komponen pertama dari char[]: " +kata[0]);
        System.out.println("komponen pertama dari judul lagu: "+judullagu.charAt(0)); 
        kata[0] = 'T';
        System.out.println(Arrays.toString(kata));
    }
    
}
