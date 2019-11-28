/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleclase;

/**
 *
 * @author robij
 */
public class Sumador {
    public double resultado; 
    
    public Sumador() {
    }
    
    public double Sumar(double numero1, double numero2){
        resultado = numero1 + numero2;
        
        return resultado;
    }
    
    public void ImprimirResultado(){
        System.out.println(resultado);
    }
}
