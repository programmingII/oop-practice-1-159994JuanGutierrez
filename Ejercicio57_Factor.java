//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 4:23

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio57_Factor
{
	
	static Scanner numeros = new Scanner(System.in);
		
		public static void main(String[] ags)
		{
			//Declaramos variables
			int x, contador = 0;

			//Preguntamos por el numero y despues lo leemos
			System.out.println("Ingrese el numero para sacar el factor: ");

			x = numeros.nextInt();

			//imprimimos el valor que nos devuelve la funcion
			System.out.println(resultado(x, contador));

		}
		//creamos una funcion para sacar el factor
		public static int resultado(int numero, int contador)
		{
			//en este loop sacamos el factor
			for(int i = 1; i <= numero; i++)
			{
				//esta condicional nos dice si encontro un factor
				if(numero % i == 0)
				{
					contador++;
				}
			}
			return contador;	
			
		}
		

}