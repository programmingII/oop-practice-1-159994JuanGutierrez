//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 5:27

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio59_LowerCase
{
	
	static Scanner letras = new Scanner(System.in);
		
		public static void main(String[] ags)
		{
			//Declaramos variables
			String frase;
			
			//leemos la frase
			frase = letras.nextLine();
			
			//Convertimos el string a lowercase
			System.out.println(frase.toLowerCase());
				
			
		}
		

}