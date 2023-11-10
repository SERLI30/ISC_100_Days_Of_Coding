/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Day33_Array2Dimensi;

/**
 *
 * @author HP
 */
public class Day33_Array2Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String[][]huruf={
        {"A","B","C"},
        {"D","E","F"},
        {"G","H","I"},
    };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(huruf[i][j]+"");  
            }
            System.out.println(); 
        }
    }
    
}
