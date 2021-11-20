/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930
 */
package lab08;

public class ExcepcionNegativa extends IllegalArgumentException {
    
    //Excepcion cuando el numero es negativo

                public ExcepcionNegativa(){
                super("Error, la nota no puede ser negativa");
                }
                    
                    public ExcepcionNegativa(double nota){
                    super("Error, la nota: "+nota+" no puede ser negativa");
                    } 
   
}
