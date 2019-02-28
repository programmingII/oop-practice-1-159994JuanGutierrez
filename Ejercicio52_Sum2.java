//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 3:25

//Agregamos la libreria de Scanner
import java.util.Scanner;

public class Ejercicio52_Sum2
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

		//realizamos la suma
		suma = n1 + n2;
		
		//Verificamos si la suma de los n1 y n2 es igual a n3
		if(suma == n3)
		{
			System.out.print("True");
		}
		else 
		{
			System.out.print("False");
		}	

	
		

	}

	
}