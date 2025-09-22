/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_año_viciesto;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA1_25_AÑO_VICIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu =new Scanner (System.in);
        int num1 =2024, num2 =4;
        int resi;
        System.out.println("Introduce el año:");
        resi = num1 % num2;
        System.out.println("Residuo de 2024%4=");
        
        System.out.println("resi");
        if(resi ==0){
            System.out.println("puede que sea bisiesto!!");
             }else{
        int n1 =2024,n2 =100;
        int res;
        res = n1 % n2;
        System.out.println("Residuo de 2024%100=");
        System.out.println("res");
        if (res==0)
          System.out.println("No es bisiesto");
        else{
            System.out.println("el año" + year +"no es bisiiesto"");
            else{
                    System.out.println("el año" + year "no es bisiesto");
                    }
        }
        
        }
        
    }
    
}
