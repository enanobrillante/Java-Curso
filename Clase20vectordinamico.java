import java.util.Scanner;

public class Clase20vectordinamico{
 public static void main(String args[]){
 
	int longitud = 0;
	Scanner entrada = new Scanner (System.in);
	System.out.println("¿Cuantos números desesa guardar en el vector?");
	System.out.print("Ingrese el numero: ");
	longitud = entrada.nextInt();

	int numeros[] = new int[longitud];
	
	for(int i = 0; i < numeros.length; i++){
	  System.out.println("Ingrese el valor #" + (i + 1));
	  numeros[i] = entrada.nextInt();
	}
	for(int i = 0; i < numeros.length; i++){
	  System.out.print("[" + numeros[i] + "]");
	}
	
 }
}