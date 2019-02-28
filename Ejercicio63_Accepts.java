//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 6:28

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio63_Accepts
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
		public static int resultado(int numero1, int numero2)
		{
			//primero verificamos si los 2 son iguales
			if(numero1 == numero2)
			{
				//regresamos 0
				return 0;
			}
			//si la el residuo de numero divido en 6 el de numero 2 son iguales se prosigue
			if(numero1 % 6 == numero2 % 6)
			{
				//nos dice si es verdadero esta condicional ternaria
				return (numero1 < numero2) ? numero1 : numero2;
			}
			//nos regresa el resultado en entero
			return(numero1 > numero2) ? numero1 : numero2;

		}
			
		

}