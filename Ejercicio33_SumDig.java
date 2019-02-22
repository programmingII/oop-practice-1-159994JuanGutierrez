//
//Fecha: 2/21/19
//Hora: 10:57p.m

//Agregando libreria para poder utilizar el scanner
import java.util.Scanner;

public class Ejercicio33_SumDig
{
	//Instanciamos el Scanner para poder leer las teclas
	static Scanner numero = new Scanner(System.in);

	public static void main(String[] ags)
	{
		//Declarando variables
		int numeros,resultado = 0,contador = 0;
		int[] Digitos = new int[20];

		//Preguntamos por el entero
		System.out.println("Ingrese el entero al cual desea sumar sus digitos");
		
		//Le damos los valores a la variable
		numeros = numero.nextInt();

		//hacemos un loop para separar los digitos
		for(int i = 1; numeros != 0; i++)
		{
			//esta operacion me da el ultimo digito del numero
			Digitos[i] = numeros % 10;
			
			//divido entre 10 para quitarle el ultimo digito
			numeros = numeros / 10;
			
			contador++;
			
		}
		

		//loop inverso para sumar los digitos
		while (contador != 0)
		{
			resultado = Digitos[contador] + resultado;
			contador--;
		}
 		//imprimiendo el resultado
		System.out.println("el resultado es: " + resultado);
		
	}	
}