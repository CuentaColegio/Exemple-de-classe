/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleclase;

/**
 *
 * @author Joanmi
 */
public class Dividiendo {
    

    public int resultadoDiv; 
    
    public Dividiendo() {
    }
    
    // Divide 2 numeros.
    public  int Dividir(int num1, int num2){
        resultadoDiv = num1/num2;
        
        return resultadoDiv;
    }
    
    // Imprime el resultado de la division
    
   public void VerResultado(){
       System.out.println(resultadoDiv);
   }

   
}
    

