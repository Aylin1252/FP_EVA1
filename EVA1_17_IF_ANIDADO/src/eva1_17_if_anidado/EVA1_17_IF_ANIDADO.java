/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_if_anidado;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA1_17_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu=new Scanner (System.in);
        System.out.println("numero del dia de la semana");
        dia =captu.nextInt();
        
        if(dia ==1){
            System.out.println("domingo");
        } else if(dia ==2){
            System.out.println("Lunes");
        }else  if(dia ==3){
            System.out.println("Martes");
        }else    if(dia ==4){
            System.out.println("Miercoles");
        }else if(dia ==5){
            System.out.println("jueves");  
        }else    if(dia ==6){
            System.out.println("viernes");
        }else    if(dia ==7){
            System.out.println("Sabado");
        }else{
            System.out.println("Dia de la semana no valido");
        }
        
                
            
            
            
        }
    }
    
}
