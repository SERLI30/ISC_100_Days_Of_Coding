
package day37_operasipadaarray;

import java.util.Scanner;


public class Day37_OperasipadaArray {

    
    public static void main(String[] args) {
        String[]makanan=new String[10];
        Scanner serli= new Scanner(System.in);
        for (int i=1; i<makanan.length; i++){
            System.out.print("Makanan ke-" + i +": ");
            makanan[i]= serli.nextLine();
        
                }
            
        for(String b : makanan){  
        
        System.out.println(b);
        
        
    }
    
}}
