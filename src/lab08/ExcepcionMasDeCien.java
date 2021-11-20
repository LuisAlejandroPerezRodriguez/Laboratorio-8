/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

public class ExcepcionMasDeCien extends IllegalArgumentException{
    
     //Excepcion cuando el numero es mayor de 100
    public ExcepcionMasDeCien(){
                    super("Error, la nota no puede ser mayor de 100");
                    }

                        public ExcepcionMasDeCien(double nota){
                        super("Error, la nota: "+nota+" no puede ser mayor de 100");
                        } 
    
    
    
}
