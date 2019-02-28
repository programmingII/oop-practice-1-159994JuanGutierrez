//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 5:32

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio60_Penultima
{
	
	static Scanner letras = new Scanner(System.in);
		
		public static void main(String[] ags)
		{
			//Declaramos variables
			String frase; 

			//preguntamos por la frase
			System.out.println("ingrese una frase: ");

			//leemos la frase
			frase = letras.nextLine();

			//hacemos split en las palabras
			String[] palabras= frase.split(" ");
			
			System.out.println("Penultima palabra: " + palabras[palabras.length - 2]);
						
			
		}
		

}