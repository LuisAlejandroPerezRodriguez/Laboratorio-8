/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930
 */
package lab08;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class SerializeScores {
    
    static int [][] Notas={
        {18,90,45,23,90},
        {90,78,56,45,34},
        {90,23,54,46,67},
        {78,56,34,23,54}, 
        {90,100,78,78,19},
    
    };
    
     public void Mostrar() {
     try{
     TestScoresEjericio9[] testscores=new TestScoresEjericio9[5];
     
     for(int i=0;i<Notas.length;i++){
     testscores[i]=new TestScoresEjericio9(Notas[i]);
     }
     
     String file="/Users/luisa/OneDrive/Documentos/POO/Noviembre/Lab08/src/lab08/Test.dat";
     
     ObjectOutputStream ob1= new ObjectOutputStream(new FileOutputStream(file));
     
     for(int i=0;i<testscores.length;i++){
     ob1.writeObject(testscores[i]);
     }
     ob1.close();
     System.out.println("Se creo y esribio el archivo Test");
     
     }catch(Exception Error){
         System.out.println(Error.getMessage());
     
     }
     
     }
    
}
