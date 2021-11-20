/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author luisa
 */
public class ExcepcionNegativa extends IllegalArgumentException {
    
    //Excepcion cuando el numero es negativo

                public ExcepcionNegativa(){
                super("Error, la nota no puede ser negativa");
                }
                    
                    public ExcepcionNegativa(double nota){
                    super("Error, la nota: "+nota+" no puede ser negativa");
                    } 
   
}
