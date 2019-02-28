//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 6:12

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio61_Reverse
{
	
	static Scanner letras = new Scanner(System.in);
		
		public static void main(String[] ags)
		{
			//Declaramos variables
			String frase, resultado = ""; 

			//preguntamos por la frase
			System.out.println("ingrese una frase: ");

			//leemos la frase
			frase = letras.nextLine();
			
			//creamos una copia sin espacios
			frase = frase.trim();
			
			//metemos los caracteres a un arreglo
			char[] ch = frase.toCharArray();
			
			//creamos un loop para invertir el orden
			for(int i = ch.length - 1 ; i >= 0; i--)
			{
				resultado += ch[i];
			}
			
			//imprimimos resultado
			System.out.println("palabra al revez: " + resultado.trim());			
			
		}
		

}