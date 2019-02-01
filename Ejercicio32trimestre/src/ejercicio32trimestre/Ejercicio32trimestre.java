/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32trimestre;

/**
 *
 * @author Usuario DAM 1
 */
public class Ejercicio32trimestre {
    public static void main(String[] args) {
    int[] num = new int[10];
    int[] resultado = new int[10];
    int contador = 0;
    int cuentaArray = 0;
    int prim = 0;
    int prueba = 0;
    
    System.out.println("Introduzca 10 números");
    //primero pedimos los números por teclado
    for (int i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Índice\tValor");
    //mostramos el array
    for (int i = 0; i < 10; i++) {
      System.out.println(i + "\t" + num[i]);
    }
    
    //comprobamos cuales son primos y los posicionamos primero
    for (int i = 0; i < 10; i++) {
      do {
        prim++;
        prueba = num[i] % prim;
        
        if (prueba == 0) {
          contador++;
        } else {
          //nada
        }
      } while (prim != num[i]); 
      
        if (contador == 2) {
          resultado[cuentaArray] = num[i];
          cuentaArray++;
        } else {
        //nada
        }
      
      contador = 0;
      prim = 0;
    }//for
    
    //ahora metemos en el array resultante los que quedan
    for (int i = 0; i < 10; i++) {
      do {
        prim++;
        prueba = num[i] % prim;
        
        if (prueba == 0) {
          contador++;
        } else {
          //nada
        }
      } while (prim != num[i]);  
      
        if (contador != 2) {
        resultado[cuentaArray] = num[i];
        cuentaArray++;
        } else {
        //nada
        }
      
      contador = 0;
      prim = 0;
    }//for
    
    System.out.println("\nArray final");
    
    System.out.println("Índice\tValor");
    
    for (int i = 0; i < 10; i++) {
      System.out.println(i + "\t" + resultado[i]);
    }
  }
}  
   
    

