//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/26/2019
//Hora: 9:07

//Agregamos la libreria que contiene el Scanner
import java.util.Scanner;

public class Ejercicio37_Reverso
{
	static Scanner Letras = new Scanner(System.in);	

	public static void main(String[] ags)
	{

		//Declaramos las variables
		String Frase,reverso = "";
		int i;

		//Preguntamos por las palabras
		System.out.print("Escriba las palabras que desea invertir: ");
		
		//Leemos el string
		Frase = Letras.nextLine();

		//Aqui haremos el proceso para voltear la cadena
		//lenght() nos muestra en entero la cantidad de digitos que tiene el string
		//charAt() nos indica que vamos a utilizar el caracter en ese lugar especifico
		for(i = Frase.length()-1; i >= 0; i--)
		{
	
			reverso = reverso + Frase.charAt(i);
		
		}
		//Imprimos el resultado
		System.out.println("la cadena invertida es: " + reverso);

	}


}