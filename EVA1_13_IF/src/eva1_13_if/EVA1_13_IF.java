/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACION DE VARIABLES
        double califa;
        Scanner captu = new Scanner (System.in);
        //CAPTURA
        System.out.println("introduce tu calificacion:");
        califa = captu.nextDouble();
        //ESTRUCTURA DE CONTROL IF - THEN -ELSE
        if(califa >= 70){//SOLO EVALUA VERDADERO O FALSO
        System.out.println("Felicitaciones, acreditaste!!");
        
        }else {    //SECCION FALSO(OPCIONAL)
            System.out.println("Azotes!!");
            
    }   }
}
