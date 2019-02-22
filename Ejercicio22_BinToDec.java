//
//Fecha: 2/21/19
//Hora: 9:32p.m

//Agregamos la libreria de Scanner (nos leera las teclas de teclado)
import java.util.Scanner;

public class Ejercicio22_BinToDec
{

	//Esto nos dice que vamos a agregar datos a una variable por medio del teclado
	static Scanner Bin = new Scanner(System.in);	

	public static void main(String[] ags)
	{
		//Declarando variable
		int Decimal;
		String Binario;
		
		//Preguntaremos por el numero decimal
		System.out.println("Ingrese el numero Binario a convertir");
		
		//Leemos el numero decimal
		 Binario = Bin.nextLine();
		
		//Convertimos el Binario a Decimal y lo imprimimos
		System.out.println("El resultado es: " + Integer.parseInt(Binario, 2));
		
	}	
}