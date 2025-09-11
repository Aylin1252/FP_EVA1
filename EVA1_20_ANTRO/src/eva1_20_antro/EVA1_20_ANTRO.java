/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;



/**
 *
 * @author aylin
 */
public class EVA1_20_ANTRO {
 final static String ACCESO_EDAD = "si";
 final static String ACCESO_INE = "si";
 

    
    public static void main(String[] args) {
        String Edad,INE;
        Scanner cap= new Scanner(System.in);
        
        System.out.println("Acceso al antro");
        System.out.println("antro");
        
        System.out.println("eres mayor de edad?");
        Edad = cap.nextLine();
        
        System.out.println("enseña tu ine");
        INE = cap.nextLine();
        
        if(Edad.equals(ACCESO_EDAD)){
            if(INE.equals(ACCESO_INE)){
                System.out.println("puedes entrar");
                
            }else{
                System.out.println("no puedes entrar");
            }
        }else{
            System.out.println("denegado");
        }
        
    }
    
}
