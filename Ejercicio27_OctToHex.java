//
//Fecha: 2/21/19
//Hora: 10:03p.m

//Agregamos la libreria de Scanner (nos leera las teclas de teclado)
import java.util.Scanner;

public class Ejercicio27_OctToHex
{

	//Esto nos dice que vamos a agregar datos a una variable por medio del teclado
	static Scanner Oct = new Scanner(System.in);	

	public static void main(String[] ags)
	{
		//Declarando variable
		String Octal;
		
		//Preguntaremos por el numero Octal
		System.out.println("Ingrese el numero Octal convertir");
		
			
		//Leemos el numero Octal
		Octal = Oct.nextLine();
		

		//Convertimos el octal a Hexadecimal y lo imprimos
		System.out.println("El resultado es: " + Integer.toHexString(Integer.parseInt(Octal, 8)));
		
	}	
}