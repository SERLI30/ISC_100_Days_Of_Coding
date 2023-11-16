/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day38_arraymultidimensi;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Day38_ArrayMultidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     int [][] array_2D = {
//         {11,12,13,14,15},
//         {16,17,18,19,20}
//          
//     };
//   printArray2D(array_2D);
//       
//int [][] arrayAngka = new int [3][5];
//
// printArray2D(arrayAngka);
// 
// }
//  private static void printArray2D(int[][] dataArray) {
// for(int i = 0; i < dataArray.length; i++) {
//          
//             System.out.println(Arrays.toString(dataArray[i]));
Scanner serli = new Scanner(System.in);
        int s = serli.nextInt();
        int[]l =new int[s];
        int a = 0;
        int b = 5;
        
        for (int i = 0; i < l.length; i++) {
            if(s % 5 == 0){
                if(b% 5 == 0){
                    System.out.println(l[i]+b);
                    b++;
            
        }
                b++;
            }else if(s % 5 != 0){
                a++;
            if(a % 5 != 0)
                    System.out.println(l[i]+a);
            }
            a++;
   }
        
    }

    
    
}
