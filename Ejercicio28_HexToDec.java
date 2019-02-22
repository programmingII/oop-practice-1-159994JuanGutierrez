//
//Fecha: 2/21/19
//Hora: 10:08p.m

//Agregamos la libreria de Scanner (nos leera las teclas de teclado)
import java.util.Scanner;

public class Ejercicio28_HexToDec
{

	//Esto nos dice que vamos a agregar datos a una variable por medio del teclado
	static Scanner Hex = new Scanner(System.in);	

	public static void main(String[] ags)
	{
		//Declarando variable
		String Hexadecimal;
		
		//Preguntaremos por el numero Hexadecimal
		System.out.println("Ingrese el numero Hexadecimal a convertir");
		
			
		//Leemos el numero Hexadecimal
		Hexadecimal = Hex.nextLine();
		

		//Convertimos el Hexadecimal a Decimal y lo imprimos
		System.out.println("El resultado es: " + Integer.parseInt(Hexadecimal, 16));
		
	}	
}