/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930
 */
package lab08;

public class Lab08 {

    public static void main(String[] args) {
        
        //problema 1
        try {
            int[] test={99,-88,102,77};
            TestScores TS1=new TestScores(test);
            
        }catch(ExcepcionNegativa Error1){
            System.out.println(Error1.getMessage());
        }catch(ExcepcionMasDeCien Error2){
            System.out.println(Error2.getMessage());
        }
            
        
    
    }

}