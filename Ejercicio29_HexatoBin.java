//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 21/02/2019
//Hora: 12:32

//Agregamos la libreria para poder utilizar el scanner
import java.util.Scanner;

public class Ejercicio29_HexatoBin
{
	//Me permite Escribir en las variables desde el teclado
	static Scanner Hexa = new Scanner(System.in);
	public static void main(String[] ags)
	{
		//Declarare variables
		String Hexadecimal;
		//Primero preguntare por el numero hexadecimal
		System.out.println("Ingrese el numero Hexadecimal que desea convertir a binario");
		//Leere el numero hexadecimal desde el teclado
		Hexadecimal = Hexa.nextLine();
		//Convertiremos el numero Hexadecimal a Decimal para poder realizar mas facil la operacion a binario
		int Decimal = Integer.parseInt(Hexadecimal , 16);
		//Probando que el numero se alla convertido a decimal
		System.out.println("Numero decimal: " + Decimal);
		//Convirtiendo el numero decimal a binario
		System.out.println("El numero binario es: " + Integer.toBinaryString(Decimal));
		
		
	}
}