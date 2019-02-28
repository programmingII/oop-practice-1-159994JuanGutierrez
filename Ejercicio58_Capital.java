//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 4:43

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio58_Capital
{
	
	static Scanner letras = new Scanner(System.in);
		
		public static void main(String[] ags)
		{
			//Declaramos variables
			String frase;
			char espacio = ' ';
			int contador = 0;
			
			//preguntamos por la frase
			System.out.println("Ingrese una frase: ");
			
			// leemos la frase
			frase = letras.nextLine();

			//primero contaremos el numero de letras que tiene el string
			for(int i = 0; i < frase.length(); i++)
			{
				//imprimimos las letras
				//creamos unas condiciones para sabes si tiene que ser mayuscula
				if(contador == 1)
				{
					System.out.print(Character.toUpperCase(frase.charAt(i)));
					contador--;
				}
				//esta condicion siempre nos va a poner en mayuscula la primer letra por ley
				else if(i == 0)
				{
					System.out.print(Character.toUpperCase(frase.charAt(i)));		
				}
				//esta condicion nos dice si se detecto un espacio y la siguiente letra tiene que ser mayuscula
				else if(frase.charAt(i) == espacio)
				{
					System.out.print(frase.charAt(i));
					contador++;
				}
				//se imprime la letra si no tiene que ser capitalizada
				else
				{
					System.out.print(frase.charAt(i));
				}
				
			}
		}
		

}