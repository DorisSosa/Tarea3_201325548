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
    
    Scanner leer= new Scanner(System.in);
    int notas[][]=new int[6][6];
    
    public void menuPromedio(){
        
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
                    System.out.println("Has regresado al menu principal"); 
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
                    
            }
        }while(opcion!=3);
    }
    
    private void ingresarNotas(){
        for (int fila=0; fila<6; fila++){     //recorre la matriz fila por fila
            System.out.println("Ingrese notas de alumno " + (fila+1));     
            notas[fila][0]= (fila+1);     //escribe un correlativo en la primera columna
            for (int columna=1; columna<5;columna++){     //recorre la matriz columna por columna
                System.out.println("unidad " + columna);    
                notas[fila][columna]=leer.nextInt();    //asigna el entero escrito por el usuario en la fila y columna indicada
            }
        }
    }
    
    private void mostrarPromedio(){
        
        int suma=0;
        int promedio;
        for (int fila=0;fila<6;fila++){     //recorre la matriz fila por fila
             
            for(int columna=1;columna<5; columna++){      //recorre la matriz columna por columna 
                suma= suma + notas[fila][columna];      //suma los datos de cada fila
            }  
            promedio=suma/4;     //promedia los datos
            notas[fila][5]=promedio;    //escribe el promedio en la ultima columna
            suma=0;     //asigna a la variable suma el valor 0 para volver a usarla en la sig fila
        }
        
        for (int fila=0;fila<6;fila++){ 
            for(int columna=0;columna<6; columna++){         
                System.out.print("\t" + notas[fila][columna] + " ");        //muestra la matriz 
            }
            System.out.println("");   //inserta un salto de linea
        }
    }
}
