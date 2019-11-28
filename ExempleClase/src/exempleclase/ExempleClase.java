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
        // Hacking code here
        System.out.println("Hola Puta");
        System.out.println("JAJAJAJJAJAJ");
        double n1 = 0;
        double n2 = 0;
        double resultado = 0;
        
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
    }
    
}
