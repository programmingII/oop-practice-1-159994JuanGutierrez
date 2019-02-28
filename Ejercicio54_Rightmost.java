//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 3:53

//Agregamos la libreria de Scanner
import java.util.Scanner;

public class Ejercicio54_Rightmost
{
	static Scanner numeros = new Scanner(System.in);

	public static void main(String[] args) 
	{

		//Declaramos variables
		int n1, n2, n3, suma;
		
		//preguntamos por el primer numero
		System.out.print("Ingrese el Primer numero: ");

		//leemos el numero
		n1= numeros.nextInt();
		
		//preguntamos por el Segundo numero
		System.out.print("Ingrese el Segundo numero: ");

		//leemos el numero
		n2 = numeros.nextInt();
		
		//preguntamos por el Tercer numero
		System.out.print("Ingrese el Tercer numero: ");

		//leemos el numero
		n3 = numeros.nextInt();
		
		System.out.print("The result is: "+test_last_digit(n1, n2, n3, true));
		System.out.print("\n");

	}
		
	public static boolean test_last_digit(int p, int q, int r, boolean xyz)
	{
	     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
	}
	
}