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
public class Promedio {
    
    public void menuPromedio(){
        
        Scanner leer;
        leer = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("1. Ingresar Notas ");
            System.out.println("2. Mostrar Promedio");
            System.out.println("3. Menu Principal");
            
            opcion = leer.nextInt();    
            
            switch(opcion){
                case 1:
                    ingresarNotas();
                    break;
                case 2:
                    mostrarPromedio();
                    break;
                case 3:
                     
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
                    
            }
        }while(opcion!=4);
    }
    
    private void ingresarNotas(){
        System.out.println("Estamos trabajando en ello");
    }
    
    private void mostrarPromedio(){
        System.out.println("Estamos trabajando en ello");
    }
}