/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_prac9_captura;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA1_PRAC9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);//creamos el Scanner
        System.out.println("introduce el nombre completo:");
        //como capturar en java:
        
        nombre = input.nextLine();//capturamos texto
        System.out.println("introduce la edad:");
        edad= input.nextInt();
        
        System.out.println("captura el promedio:");
        promedio = input.nextDouble();
        
        System.out.println("el nombre capturado es:");
        System.out.println(nombre);
        System.out.println("la edad es:");
        System.out.println(edad);
        System.out.println("el promedio es:");
        System.out.println(promedio);
        
    }
    
}
