//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 7:19

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio64_25to75
{
	
	static Scanner numeros = new Scanner(System.in);
		
		public static void main(String[] ags)
		{
			//Declaramos variables
			int x, y;
			
			//pedimos los 3 numeros
			System.out.println("Introduzca el primer numero: ");
			
			x = numeros.nextInt();
			
			System.out.println("Introduzca el segundo numero: ");
			
			y = numeros.nextInt();
			
			//Imprimimos el resultado
			System.out.println("Result: " + resultado(x, y));
			
		}
		//creamos una funcion para resolver el problema
		public static boolean resultado(int numero1, int numero2)
		{
			//verificamos si p es menor a 25 o si q es mayor a 75
			if (numero1<25 || numero2>75)
			{		
				return false;
			}
			int i = numero1 % 10;
			int j = numero2 % 10;
			//divide numero 1 entre 10 y pone el resultado en numero1
			numero1 /= 10;
			numero2 /= 10;
			//arroja el resultado
			return (numero1 == numero2 || numero1 == j || i == numero2 || i == j);
		}
			
		

}