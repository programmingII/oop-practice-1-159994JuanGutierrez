//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 7:27

//Agregamos un scanner
import java.util.Scanner;

public class Ejercicio65_Modulo
{
	
	static Scanner numeros = new Scanner(System.in);
		
		public static void main(String[] ags)
		{

		//preguntamos por el primer numero y lo leemos
		System.out.print("Input the first number : ");
		int a = numeros.nextInt();  

		//preguntamos por el segundo numero y lo leemos
		System.out.print("Input the second number: ");
		int b = numeros.nextInt(); 
		
		//hacemos las operaciones y imprimimos resultado
		int divided = a / b;
		int result = a - (divided * b);
		System.out.println(result); 
		}
			
		

}