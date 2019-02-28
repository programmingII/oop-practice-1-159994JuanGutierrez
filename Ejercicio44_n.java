//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 2:17

//Agregamos el Scanner
import java.util.Scanner;

public class Ejercicio44_n
{	
	//creamos el scanner para poder leer teclas
	static Scanner numero = new Scanner(System.in);

	public static void main(String[] ags)
	{
		
		//Declaramos las variables
		int n;
		
		//preguntamos por el numero
		System.out.print("ingrese el numero: ");
		
		//Leemos n
		n = numero.nextInt();

		//imprimimos resultado
		System.out.println( n + " + " + n + n + " + " + n + n + n);  
	
	}

}