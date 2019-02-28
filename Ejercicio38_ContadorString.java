//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/26/2019
//Hora: 1:10

//Agregamos la libreria que contiene el Scanner
import java.util.Scanner;

public class Ejercicio38_ContadorString
{
	static Scanner Letras = new Scanner(System.in);	

	public static void main(String[] ags)
	{

		//Declaramos las variables
		String Frase;
		int i, LetrasX = 0, Numeros = 0, Espacios = 0, Otros = 0;

		//Preguntamos por las palabras
		System.out.print("Escriba las palabras que va a contar: ");
		
		//Leemos el string
		Frase = Letras.nextLine();

		//Aqui haremos el proceso para voltear la cadena
		//lenght() nos muestra en entero la cantidad de digitos que tiene el string
		//charAt() nos indica que vamos a utilizar el caracter en ese lugar especifico
		//Character.isLetter()/.isDigit()/,isSpaceChar() son metodos que nos dice si el caracter es letra,digito y espacio respectivamente
		for(i = Frase.length()-1; i >= 0; i--)
		{
			
						
			if(Character.isLetter(Frase.charAt(i)))
			{
				LetrasX++;
			}
			
			else if(Character.isDigit(Frase.charAt(i)))
			{
				Numeros++;
			}

			else if(Character.isSpaceChar(Frase.charAt(i)))
			{
				Espacios++;
			}
			
			else
			{

				Otros++;
			}
		
		}
		//Imprimos los resultados
		System.out.println("la cantidad de letras es: " + LetrasX);
		System.out.println("la cantidad de numeros es: " + Numeros);
		System.out.println("la cantidad de espacios es: " + Espacios);
		System.out.println("la cantidad de otros es: " + Otros);

	}


}