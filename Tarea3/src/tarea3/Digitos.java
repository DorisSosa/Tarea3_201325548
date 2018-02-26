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
public class Digitos {
    
    Scanner leer = new Scanner(System.in);
    int n=0;
    
    public void menuDigitos(){
        
        int opcion;
        
        do{
            System.out.println("1. Ingresar Numero");
            System.out.println("2. Mostrar Numero de digitos"); 
            System.out.println("3. Menu Principal");
            
            opcion = leer.nextInt();    
            
            switch(opcion){
                case 1:
                    ingresarDigitos();
                    break;
                case 2:
                    mostrarDigitos();
                    break;
                case 3:
                    System.out.println("Regreso al menu principal");
                    break; 
                default:
                    System.out.println("Opcion Invalida");
                    break;
                    
            }
        }while(opcion!=3); 
    }
    
    private void ingresarDigitos(){
        
        System.out.println("Ingrese un numero mayor a 0");
        n=leer.nextInt();
        if ((n<=0)||(n>100000)){
            System.out.println("Numero invalido. Ingrese un numero");
            n=leer.nextInt();
        }
    }
    private void mostrarDigitos(){   //metodo para contar los digitos (tarea2)
        int cont=0;    
        if (n!=0){    //verifica que se haya ingresado un numero
            do {        
                n /= 10;    
                cont++;   
            } while (n > 0);
            
            System.out.println("El nimero de digitos es: " + cont);  //muestra numero de digitos
        }else{
            System.out.println("ingrese un numero");
        }
    }
}
