/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;
import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class Numeros {
    
    public void menuNumeros(){
        
        Scanner leer;
        leer = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("1. Ingresar Numeros");
            System.out.println("2. Mostrar Numeros"); 
            System.out.println("3. Menu Principal");
            
            opcion = leer.nextInt();    
            
            switch(opcion){
                case 1:
                    ingresarNumero();
                    break;
                case 2:
                    mostrarNumero();
                    break;
                case 3:
                    System.out.println("Regreso al menu principal");  
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
                    
            }
        }while(opcion!=4);
    }
    
    private void ingresarNumero(){
        System.out.println("Estamos trabajando en ello");
    }
    
    private void mostrarNumero(){
        System.out.println("Estamos trabajando en ello");
    }
}
