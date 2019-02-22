//
//Fecha: 2/21/19
//Hora: 10:42p.m

//Agregando libreria para poder utilizar el scanner
import java.util.Scanner;

public class Ejercicio32_Comparar
{
	//Instanciamos el Scanner para poder leer las teclas
	static Scanner Compara = new Scanner(System.in);

	public static void main(String[] ags)
	{
		//Declarando las variables
		int entero1,entero2;

		//Preguntamos por el primer numero entero a comparar
		System.out.println("Dime tu primer numero");
	
		//Recibiendo el primer numero
		entero1 = Compara.nextInt();
		
		//Preguntamos por el segundo numero entero a comparar
		System.out.println("Dime tu segundo numero");

		//Recibiendo el segundo numero
		entero2 = Compara.nextInt();

		//Verificando si el primer numero es diferente del segundo
		if(entero1 != entero2)
		{
			//imprimos resultado
			System.out.println(entero1 + " != " + entero2);
		}
		else
		{
			System.out.println(entero1 + " == " + entero2);
		}

		//Verificando si el primer numero es menor al segundo
		if(entero1 < entero2)
		{
			System.out.println(entero1 + " < " + entero2);
		}
		else
		{
			System.out.println(entero1 + " > " + entero2);

		}	

		//Verificando si el primer numero es menor o igual al segundo
		if(entero1 <= entero2)
		{
			System.out.println(entero1 + " <= " + entero2);
		}
		else
		{
			System.out.println(entero1 + " >= " + entero2);
		}
		
		
		
	}	
}