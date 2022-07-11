import java.util.Scanner;

public class Clase23{
 public static void main(String args[]){
  
  Scanner entrada = new Scanner(System.in);
  
  int contador = 0;
  int filas = 0, columnas = 0;
  
  System.out.println("Ingrese el numero de filas que tendrá la matriz: ");
  filas = entrada.nextInt();
  
  System.out.println("Ingrese el numero de columnas que tendrá la matriz: ");
  columnas = entrada.nextInt();
  
  int numeros[][] = new int [filas][columnas];
  
  for(int j = 0; j < filas ; j++){
    for(int i = 0; i < columnas ; i++){
       System.out.print("Ingrese el numero a guardar: ");
       contador = entrada.nextInt();
       numeros[j][i] = contador;
       System.out.println("Guardado en posicion: " + j + "," + i);
       System.out.println("");
     }
   }
  
  for(int j = 0; j < filas ; j++){
    for(int i = 0; i < columnas ; i++){
       System.out.print("[" + numeros[j][i] + "]");
     }System.out.println( "");  
  } 
 }
}