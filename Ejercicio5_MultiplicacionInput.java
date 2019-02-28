//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/5/2019
//Hora: 7:00

import java.util.Scanner;

public class Ejercicio5_MultiplicacionInput
{

static Scanner numeros = new Scanner(System.in);

	public static void main(String[] ags)
	{
		
		int resultado;
				
		System.out.println("Ingrese el primer numero\n");
		int numero1 = numeros.nextInt();
		System.out.println("Ingrese el segundo numero\n");
		int numero2 = numeros.nextInt();
		
		resultado = numero1 * numero2;
		System.out.println(resultado);	
		
	}

}
