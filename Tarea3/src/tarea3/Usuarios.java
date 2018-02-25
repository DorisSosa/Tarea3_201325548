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
public class Usuarios {
    
    public void menuUsuarios(){
        
        Scanner leer;
        leer = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("1. Ingresar Usuarios");
            System.out.println("2. Mostrar Usuarios Ascendente");
            System.out.println("3. Mostrar Usuarios Descendente");
            System.out.println("4. Menu Principal");
            
            opcion = leer.nextInt();    
            
            switch(opcion){
                case 1:
                    ingresarUsuarios();
                    break;
                case 2:
                    mostrarUsuariosAscendente();
                    break;
                case 3:
                    mostrarUsuariosDescendente();
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
                    
            }
        }while(opcion!=4);
    }
    
    private void ingresarUsuarios(){
        System.out.println("Estamos trabajando en ello");
    }
    
    private void mostrarUsuariosAscendente(){
        System.out.println("Estamos trabajando en ello");
    }
    
    private void mostrarUsuariosDescendente(){
        System.out.println("Estamos trabajando en ello");
    }
}
