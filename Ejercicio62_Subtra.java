//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 6:28

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio62_Subtra
{
	
	static Scanner numeros = new Scanner(System.in);
		
		public static void main(String[] ags)
		{
			//Declaramos variables
			int x, y, z;
			
			//pedimos los 3 numeros
			System.out.println("Introduzca el primer numero: ");
			
			x = numeros.nextInt();
			
			System.out.println("Introduzca el segundo numero: ");
			
			y = numeros.nextInt();
			
			System.out.println("Introduzca el tercer numero: ");
			
			z = numeros.nextInt();

			
			//Math.abs me da el valor absoluto
			System.out.println((Math.abs(x - y) >= 20 || Math.abs(x - z) >= 20 || Math.abs(y - z) >= 20));
			
		}
			
		

}