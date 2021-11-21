/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930

 */
package lab08;

public class InvalidTestScore extends Exception {
    
    public InvalidTestScore(){
        super("Error: la nota es invalida");
    }
    
         public InvalidTestScore (double nota){
                    super("Error. La nota: "+nota+" Es invalida");
                    } 
   
    
}
