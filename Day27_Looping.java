/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day27_looping;



/**
 *
 * @author HP
 */
public class Day27_Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.print("\n");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("*");
                if (i == j) {
                    break;
                }
            }
          System.out.print("\n");
        }
    }
    
}
