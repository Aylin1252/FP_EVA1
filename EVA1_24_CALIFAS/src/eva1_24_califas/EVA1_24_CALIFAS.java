/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA1_24_CALIFAS {
         
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captu= new Scanner (System.in);
        int cali;        
         System.out.println("cali");
         cali = captu.nextInt();
         
     
              if (cali>=90 && cali<=100){
             System.out.println("A");
    } else if(cali>=80 && cali<=89){
                      
                     System.out.println("B");
    }else if (cali>=70 && cali<=79){
              System.out.println("C");
     }else if (cali>=60 && cali<=69){
              System.out.println("D");
     }else if (cali>=50 && cali<=59){
              System.out.println("F");   
     }else{
         System.out.println("Comprueba tu cali");
     }
              
                      
           
                
    }
    
}
