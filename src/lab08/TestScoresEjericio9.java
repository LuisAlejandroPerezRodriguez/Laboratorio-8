/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930
 */
package lab08;

import java.io.Serializable;


public class TestScoresEjericio9 implements Serializable {
    
    //Atributos
    private int[]Scores;
               
        //Constructor de la clase TestScores
        public TestScoresEjericio9(int[] notas)throws ExcepcionNegativa, ExcepcionMasDeCien {
            
            //Recorrer el arreglo
            for(int i=0;i<notas.length;i++){
                int num=notas[i];               
                   if(num<0){
                   throw new ExcepcionNegativa(num);
                    }           
                        if(num>100){
                        throw new  ExcepcionMasDeCien(num);
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
