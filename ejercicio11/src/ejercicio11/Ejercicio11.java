/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author LABMOVIL
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Escribe una aplicación con un String que contenga una contraseña
/*cualquiera. Después se te pedirá que introduzcas la contraseña, con 3
intentos. Cuando aciertes ya no pedirá más la contraseña y mostrará un
mensaje diciendo “Enhorabuena”. Piensa bien en la condición de
salida (3 intentos y si acierta sale, aunque le queden intentos).*/
        
       
        
        Scanner scan=new Scanner(System.in);
        int contador=1;  
        String clave_correcta ="hola";
        String clave ="";
        System.out.print("Digita la clave :");        
        clave =scan.nextLine();       
                
        while(contador<=3){            
            if(clave.equals(clave_correcta)){ 
                System.out.println("Clave exitosa");
               break;                
            }
            else{
                System.err.println("Clave invalida.");
                
                if(contador==3)
                {
                    System.out.println("Alcanzó el Nº de intentos máximo");
                    break;
                }
                else{
                    System.out.print("Digita la clave :");
                    clave=scan.nextLine();
                }
                contador++;  
        
            }
        }
    
    }
  }
