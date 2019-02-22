//
//Fecha: 2/21/19
//Hora: 9:16p.m

//Agregamos la libreria de Scanner (nos leera las teclas de teclado)
import java.util.Scanner;

public class Ejercicio19_DecToBin
{

	//Esto nos dice que vamos a agregar datos a una variable por medio del teclado
	static Scanner Binario = new Scanner(System.in);	

	public static void main(String[] ags)
	{
		//Declarando variable
		int Decimal;
		
		//Preguntaremos por el numero decimal
		System.out.println("Ingrese el numero decimal a convertir");
		
		//Leemos el numero decimal
		Decimal = Binario.nextInt();
		
		//Convertimos el decimal a binario y lo imprimimos
		System.out.println("El resultado es: " + Integer.toBinaryString(Decimal));
		
	}	
}