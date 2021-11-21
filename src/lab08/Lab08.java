/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930
 */
package lab08;
import java.util.Scanner;

public class Lab08 {

    public static void main(String[] args) {
         Scanner key1=new Scanner(System.in);
         int respuesta; 
         char desicion='y';
         
         for(;desicion!='n';){ 
       do{
        System.out.println(" Introduzca #1. para ver proramming Challenges 1"
                + "\n Introduzca #2. para ver proramming Challenges 2"+ "\n Introduzca #3. para ver proramming Challenges 9" 
                +"\n Introduzca #0. para salir del programa");
        respuesta=key1.nextInt();
       } while( respuesta!=0 && respuesta>3);
       
        if(respuesta!=0 ){
       switch (respuesta){
        
           case 1:
        //problema 1
        try {
            int[] test={99,88,10,77}; // ← OJO aqui tiene que poner un numero negativo o mayor de 100 para probar las excepciones
            TestScores TS1=new TestScores(test);
            System.out.println(TS1.Promedio());
            
        }catch(ExcepcionNegativa Error1){
            System.out.println(Error1.getMessage());
        }catch(ExcepcionMasDeCien Error2){
            System.out.println(Error2.getMessage());
        }
         break;
        
           case 2:
            //Problema 2   
            try {
            int[] test2={89,-88,102,77}; // ← OJO aqui tiene que poner un numero negativo o mayor de 100 para probar las excepciones
            TestScoresEjercicio2 modify2=new TestScoresEjercicio2(test2);
            System.out.println(modify2.Promedio());
            }catch(InvalidTestScore Error3){
                System.out.println(Error3.getMessage());        
            }
               break;
               
           case 3:
               //problema 9
               SerializeScores s1= new SerializeScores();
               s1.Mostrar();
               
               DeserializeScores d1=new DeserializeScores();
               d1.Mostrar();
               break; 
       }
        }
        System.out.println("Desea continuar? (Escribir y para continuar o n para salir del programa)");
        desicion=key1.next().charAt(0); 
         }
    
    }

}