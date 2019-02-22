//
//Fecha: 2/21/19
//Hora: 9:46p.m

//Agregamos la libreria de Scanner (nos leera las teclas de teclado)
import java.util.Scanner;

public class Ejercicio25_OctToDec
{

	//Esto nos dice que vamos a agregar datos a una variable por medio del teclado
	static Scanner Oct = new Scanner(System.in);	

	public static void main(String[] ags)
	{
		//Declarando variable
		int Decimal;
		String Octal;
		
		//Preguntaremos por el numero decimal
		System.out.println("Ingrese el numero Octal convertir");
		
			
		//Leemos el numero Octal
		Octal = Oct.nextLine();
		

		//Convertimos el octal a Decimal y lo imprimos
		System.out.println("El resultado es: " + Integer.parseInt(Octal, 8));
		
	}	
}