//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 3:00

//Agregamos la libreria de Scanner
import java.util.Scanner;

public class Ejercicio49_EvenOrOdd
{
	static Scanner num = new Scanner(System.in);

	public static void main(String[] args) 
	{

		//Declaramos variables
		int numero;
		
		//preguntamos por el numero
		System.out.println("Ingrese un numero");
	
		//leemos el numero
		numero = num.nextInt();
	
		//realizamos 2 condiciones para saber si es par o no
		if(numero % 2 == 0)
		{
			System.out.print("1");
		} 		
		else
		{
			System.out.print("0");
		}

	}
}