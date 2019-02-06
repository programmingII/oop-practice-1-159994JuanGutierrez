//Juan Pablo Gutierrez Ceballos 2/6/2019 1:45a.m.

import java.util.Scanner;

public class Ejercicio7_TablaMultiplicar
{
	static Scanner numeros = new Scanner(System.in);

	public static void main(String[] ags)
	{
		int resultado;

		//Preguntado por los valores para realizar las operaciones
		System.out.println("Ingrese el primer valor");
		int numero1 = numeros.nextInt();

		//Utilizando ciclo para realizar tabla y imprimirla
			for(int i=1; i<=10; i++)
			{
				//Realizamos operacion
				resultado = numero1 * i;
				System.out.println(numero1 + " x " + i + " = " + resultado);
			}
	}
}