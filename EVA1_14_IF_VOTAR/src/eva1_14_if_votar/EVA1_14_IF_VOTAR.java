/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_if_votar;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA1_14_IF_VOTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año;
        Scanner captu = new Scanner (System.in);
        //CAPTURA
        System.out.println("Introduce el año de nacimiento:");
        año = captu.nextInt ();
        if (año >=2007){
        
        System .out.println("puede votar!!");
        
        }else{
          
                System.out.println("no puede votar!");
        } 
    }
    
}
