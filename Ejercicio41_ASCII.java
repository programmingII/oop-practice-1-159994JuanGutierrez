//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 26/02/19
//Hora: 12:27

//Agregamos la libreria de Scanner para poder leer las teclas
import java.util.Scanner;

public class Ejercicio41_ASCII
{

	//Aqui agregaremos los datos a las variables
	static Scanner Entero = new Scanner(System.in);	

	public static void main(String[] ags)
	{
		//Declarando variables
		char letra;
		int asc11;

		//Preguntando por la letra
		System.out.println("Ingrese la letra");

		//leyendo el teclado
		letra = Entero.next().charAt(0);

		asc11 = letra;

		//imprimiendo el valor en ASCII
		System.out.print("El valor en ASCII es: " + asc11);
	}
}