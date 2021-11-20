/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930
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
