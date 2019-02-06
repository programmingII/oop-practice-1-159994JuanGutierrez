//Juan Pablo Gutierrez Ceballos 2/6/2019 3:00a.m.

public class Ejercicio15_Cambio
{
	public static void main(String[] ags)
	{
		//Definiendo variables
		int a = 5, b = 15, cambio;
		System.out.println("Variable1 = " + a + "\nVariable2 = " + b);

		//Realizando cambio de variables
		cambio = a;
		a = b;
		b = cambio;
		System.out.println("Variables Cambiadas" + "\nVariable1 = " + a + "\nVariable2 = " + b);
	}
}