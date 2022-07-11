import java.util.Scanner;

public class Clientes
{  public static void main (String args[])
   {
    Scanner entrada = new Scanner (System.in);
    int num = 0;
    
    System.out.println("**************************************************");  
    System.out.println("** Bienvenido a Ponte Bonita Listado de clientes**");
    System.out.println("**************************************************"); 
    System.out.println("");
    System.out.print("Presione un numero para ingresar: ");
    num = entrada.nextInt();
    if(num == 5)
     { System.out.println("Ese es el numero !!!");
     }
    else if (num != 5) {
       System.out.println("AH AH AH !!! numero incorrecto vichingaaa!! jejeje");
      }
     }
}