//Juan Pablo Gutierrez Ceballos 2/6/2019 2:34a.m.

import java.util.Scanner;

public class Ejercicio12_Promedio
{
	//Agragando Scanner para leer numeros
	static Scanner numeros = new Scanner(System.in);

	public static void main(String[] ags)
	{
		//Leyendo 3 numeros con Scanner
		System.out.println("ingrese el primer numero");
		double numero1 = numeros.nextDouble();
		System.out.println("ingrese el segundo numero");
		double numero2 = numeros.nextDouble();
		System.out.println("ingrese el tercer numero");
		double numero3 = numeros.nextDouble();

		//Realizando la operacion para sacar el promedio
		double resultado = (numero1 + numero2 + numero3)/3;
		System.out.println(resultado);
	}
}