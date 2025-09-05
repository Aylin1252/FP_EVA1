/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_operaciones_boleanas;

/**
 *
 * @author aylin
 */
public class EVA1_12_OPERACIONES_BOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radio =5; //declaro inicializacion
        boolean resu; //true false
        //Uso de operadores boleanos:
        resu = radio <0; //radio (5) <0 = false
        System.out.println("Radio (5) <0 es:");
        System.out.println (resu);
        
        
        resu = radio > 0; //radio (5) >0 =true
        System.out.println("Radio (5) >0 es:");
        System.out.println (resu);
        
        
        resu = radio ==0; //radio (5) = 0
        System.out.println("Radio (5) = 0 es:");
        System.out.println (resu);
        
        
        resu = radio !=0; //radio (5) !=0
        System.out.println("Radio (5) !=0 es:");
        System.out.println (resu);
        
    }
    
}
