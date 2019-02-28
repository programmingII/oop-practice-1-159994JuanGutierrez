//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 3:50

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio56_Divisible
{
	
	static Scanner numeros = new Scanner(System.in);
		
		public static void main(String[] ags)
		{
			//Declaramos variables
			int x , y , z, contador = 0;

			//Preguntamos por los valores de los rango y seguido de eso los leemos
			System.out.println("Ingrese el primer valor del rango: ");

			x = numeros.nextInt();
		
			System.out.println("Ingrese el segundo valor del rango: ");
			
			y = numeros.nextInt();
			
			//Aqui preguntaremos por el numero divisible
			System.out.println("Ingrese el numero divisible: ");

			z = numeros.nextInt();
			//Agui regresamo el valor de la funcion y la imprimimos
			System.out.println(resultado(x, y, z, contador));
		}
		
		//Creamos una funcion que realice las operaciones
		public static int resultado(int x, int y, int z, int contador)
		{	
			//este loop lo utilizare para ver si es divisible con el otro numero
			for(int i = x; i <= y;i++)
			{
				if(i % z == 0)
				{
					contador++;
				}
			}
			//me regrese el valor del contador de la funcion
			return contador;
		}

}