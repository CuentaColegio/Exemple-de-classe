/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleclase;

import java.util.Scanner;

/**
 *
 * @author robij
 */
public class ExempleClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaración de las variables
        double n1 = 0;
        double n2 = 0;
        double resultado = 0;
        int nu1 = 0;
        int nu2 = 0;
        int resultadoDiv = 0;
        
        Scanner scn = new Scanner(System.in);
        
        Sumador sumando = new Sumador();
        // introduzco numeros.
        System.out.println("Introduce dos numeros:");
        n1 = scn.nextDouble();
        n2 = scn.nextDouble();
        
        // Los sumo.
        resultado = sumando.Sumar(n1, n2);
        
        // Los imprimo.
        sumando.ImprimirResultado();
    
    
        
        
        Scanner sc = new Scanner(System.in);
        
        Dividiendo div = new Dividiendo();
        
    // Pido números al usuario y los guardo en las variables
        
        System.out.println("Introduce dos numeros para dividir!!");        
        System.out.println("Introduce el primer número:");
        nu1 = sc.nextInt();       
        System.out.println("Introduce el segundo número:");
        nu2 = sc.nextInt();
        
        // Los divido 
        
        resultadoDiv = div.Dividir(nu1, nu2);
        
        // Imprimo el resultado de la divison
       
        div.VerResultado();
}
}
