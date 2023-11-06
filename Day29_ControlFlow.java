/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day29_controlflow;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Day29_ControlFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a = 0;
      while(true){
          a++;
          if (a == 10){
              break;
          } else if ( a <= 7){
              continue;
          } else if (a >= 15){
              return;
          }
          System.out.println("perulangan ke- " + a);
    }
}
}
