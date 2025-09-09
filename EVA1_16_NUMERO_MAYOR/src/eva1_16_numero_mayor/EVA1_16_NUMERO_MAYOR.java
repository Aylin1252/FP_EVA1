/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA1_16_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos_uno,pos_dos;
        Scanner captu =new Scanner (System.in);
        System.out.println("primer numero es:");
        pos_uno=captu.nextInt();
        System.out.println("el segundo es:");
       pos_dos=captu.nextInt ();
       if(pos_uno>pos_dos){
           System.out.println("el numero mayor es"+pos_uno);
           
       }else{
           System.out.println("el numero mayor es"+pos_dos);
       }   
    }
    
}
