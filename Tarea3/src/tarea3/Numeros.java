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
    
    Scanner leer = new Scanner(System.in);
    int opcion, num1, num2, num3;
    
    public void menuNumeros(){
         
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
        }while(opcion!=3);
    }
    
    private void ingresarNumero(){   //metodo que pide al usuario ingresar numeros
        
        System.out.println("Ingrese el primer numero");
        num1=leer.nextInt(); 
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3=leer.nextInt();
    }
    
    private void mostrarNumero(){

        int a,b,c;
        if ((num1>num2)&&(num1>num3)){            //comparan los numeros para ordenarlos de mayor a menor
            a=num1;
            
            if ((num2>num3)){
                b=num2;
                c=num3;
            }else{
                b=num3;
                c=num2;
            }
            System.out.println("el numero mayor es "+a);
            System.out.println("el numero de en medio es "+b);
            System.out.println("el numero menor es "+c);
        }
        if((num2>num1)&&(num2>num3)){
            a=num2;
            if ((num1>num3)){
                b= num1;
                c= num3;
            }else{
                b= num3;
                c= num1;
            }
            System.out.println("el numero mayor es "+a);
            System.out.println("el numero de en medio es "+b);
            System.out.println("el numero menor es "+c);
        }
        if ((num3>num1)&&(num3>num2)){
            a=num3;
            if ((num1>num2)){
                b=num1;
                c=num2;
            }else{
                b=num2;
                c=num1;
            }
            System.out.println("el numero mayor es "+a);
            System.out.println("el numero de en medio es "+b);
            System.out.println("el numero menor es "+c); 
        }
        
         
    }
}
