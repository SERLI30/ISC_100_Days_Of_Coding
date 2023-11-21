/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Day44_NilaiMAXMIN;

public class Day44_NilaiMAXMIN {

    public static void main(String[] args) {
       double[] nilai = {4, 3.1, 3, 9, 0.1, 4.2, 2, 1, 7, 9};
        double max = 0;
        double min = 100;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("nilai maksimum " + max);
        System.out.println("nilai minimum " + min);
    }


        }
            
        

