//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 3:17

//Agregamos la libreria de Scanner
import java.util.Scanner;

public class Ejercicio51_StringToInt
{
	static Scanner num = new Scanner(System.in);

	public static void main(String[] args) 
	{

		//Declaramos variables
		String numero;
		int numer;
		
		//preguntamos por el numero
		System.out.print("Ingrese un numero: ");

		//leemos el numero
		numero = num.nextLine();

		//Realizamos la conversion
		numer = Integer.parseInt(numero);

		//imprimimos resultado
		System.out.print("Tu numero es: " + numer);		

	}
}