/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930
 */
package lab08;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class DeserializeScores {
    
    static  String file="/Users/luisa/OneDrive/Documentos/POO/Noviembre/Lab08/src/lab08/Test.dat";

    
     public void Mostrar() {
     try{
         
     TestScoresEjericio9[] testscores =new TestScoresEjericio9[5];
     ObjectInputStream ob2=new ObjectInputStream(new FileInputStream(file));
     
     
     for(int i=0;i<testscores.length;i++){
     testscores[i]=(TestScoresEjericio9)ob2.readObject();
     }
     
     ob2.close();
     
     for(TestScoresEjericio9 test:testscores ){
     System.out.println("Promedio de la calificacion: "+test.Promedio());
     
     }
     
     
     }catch(Exception e){
         System.out.println(e.getMessage());
     }
     
     
     }
    
}
