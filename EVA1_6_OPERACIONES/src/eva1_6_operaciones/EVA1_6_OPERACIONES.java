/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_operaciones;

/**
 *
 * @author aylin
 */
public class EVA1_6_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // AREA DE UN CIRCULO
        //DECLARACION DE VARIABLE
        double area;
        double radio;
        double pi;
        //iniacializacion
        pi = 3.1416;
                radio = 5;
                area = pi* radio * radio;
                //imprimir
                System.out.println("El valor de un circulo de radio 5 es:");
                System.out.println(area);
                //NUEVO CIRCULO RADIO 100
                radio = 100;
                area = pi * radio * radio;
                
                 System.out.println("El valor de un circulo de radio 100 es:");
                System.out.println(area);
    }
    
}
