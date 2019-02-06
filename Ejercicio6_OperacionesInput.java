//Juan Pablo Gutierrez Ceballos 2/6/2019 1:30a.m

import java.util.Scanner;

public class Ejercicio6_OperacionesInput
{

	static Scanner numeros = new Scanner(System.in);

	public static void main(String[] ags)
	{
		double resultado1,resultado2,resultado3,resultado4,resultado5;

		//Preguntando los numeros para realizar las operaciones
		System.out.println("Ingrese el primer numero");
		int numero1 = numeros.nextInt();
		System.out.println("Ingrese el segundo numero");
		int numero2 = numeros.nextInt();

		//Realizando las operaciones y imprimiendo los resultados
		System.out.println("Resultados");
		resultado1 = numero1 + numero2;
		resultado2 = numero1 - numero2;
		resultado3 = numero1 * numero2;
		resultado4 = numero1 / numero2;
		resultado5 = numero1 % numero2;
		
		System.out.println(resultado1 + "\n" +
				   resultado2 + "\n" +
				   resultado3 + "\n" + 
				   resultado4 + "\n" + 
				   resultado5);
		
	}
}