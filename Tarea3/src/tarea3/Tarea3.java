/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;
import java.util.Scanner; //importar la clase scanner

/**
 *
 * @author Giovanni
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo principal (main)
        // TODO code application logic here
        try{                         //capturar las escepciones
        Tarea3.menu();  //llamar el metodo menu
        }catch(Exception e){
            System.out.println(e);     //muestra el error capturado
        }
    }
    
    public static void menu(){
        Scanner leer = new Scanner(System.in);  //crear el lector
        int opcion;           
        do{            //realiza la accion al menos una vez
            System.out.println("[IPC1]Tarea3_201325548");
            System.out.println(" ");
            System.out.println("1. Usuarios");
            System.out.println("2. Contador de digitos");
            System.out.println("3. Tres numeros de mayor a menor");
            System.out.println("4. Calcular promedio");
            System.out.println("5. Salir");
            
            opcion = leer.nextInt();    //leer el siguiente entero desde el teclado
            
            switch(opcion){      
                case 1:
                    new Usuarios().menuUsuarios();    //llamar el metodo menuUsuario de la clase usuarios
                    break;
                case 2: 
                    new Digitos().menuDigitos();    //llamar el metodo menuDigitos de la clase digitos
                    break;
                case 3:
                    new Numeros().menuNumeros();     //llamar el metodo menuDigitos de la clase digitos
                    break;
                case 4:
                    new Promedio().menuPromedio();        //llamar el metodo menuDigitos de la clase digitos
                    break;
                case 5: 
                    System.out.println("Has Salido del programa");  
                    break;
                default:
                    System.out.println("Opcion invalida.");     
                    menu();               //En caso de numero invalido, vuelve a escribir el menu
                    break;
            }
            
        }while (opcion != 5);     //realiza lo anterior mientras opcion sea distino de 5
    }
    
}
