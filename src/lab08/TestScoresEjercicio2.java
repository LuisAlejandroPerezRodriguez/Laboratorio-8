/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930
 */
package lab08;

public class TestScoresEjercicio2 {
    
     //Atributos
    private int[]Scores;
               
        //Constructor de la clase TestScores
        public TestScoresEjercicio2(int[] notas)throws InvalidTestScore {
            
            //Recorrer el arreglo
            for(int i=0;i<notas.length;i++){
                int num=notas[i];               
                   if(num<0){
                   throw new InvalidTestScore(num);
                    }           
                        if(num>100){
                        throw new  InvalidTestScore(num);
                        }                        
            }
                    
        this.Scores=notas;    
        }
        
              //Promedio de las notas 
               public double Promedio(){
                            
                double total=0;
                for(int i=0;i<this.Scores.length;i++){
                    total+=this.Scores[i];
                }
                return total/this.Scores.length;
                
                }
    
}
