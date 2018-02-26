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
    
    String usuarios[] = new String[5];   //crear el vector
    Scanner leer = new Scanner(System.in);    
    
    public void menuUsuarios(){
       
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
                    System.out.println("Has regresado al menu principal"); 
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
                    
            }
        }while(opcion!=4);
    }
    
    private void ingresarUsuarios(){ 
        for (int i =0; i< usuarios.length;i++){  //ciclo que recorre el vector usuario
            System.out.println("Ingrese el nombre del ususario " + (i+1));           
            usuarios[i]=leer.next(); //lee la entrada del teclado en una variable tipo string
//            for(int j=0; j<usuarios.length; j++){   //ciclo que recorre una segunda vez el vector usuario
//                if (usuarios[i].equals(usuarios[j])){    //compara el nombre ingresado con los nombres en el usuario
//                    System.out.println("Nombre ingresado con anterioridad"); 
//                }    
//            }
        }
    }
    
    private void mostrarUsuariosAscendente(){
        
        for (int i=usuarios.length; i>0; i--){     //recorre el vector de la ultima posicion a la primera (mas 1)
            System.out.println(usuarios[i-1]);      //muestra el vector en la posicion indicada (el menos 1 es para ubicarse en la posicion adecuada)
        }
    }
    
    private void mostrarUsuariosDescendente(){
        for (int i=0; i<usuarios.length; i++){   // recorre el vector de la primera posicion a la ultima
            System.out.println(usuarios[i]);
        }
    }
}
