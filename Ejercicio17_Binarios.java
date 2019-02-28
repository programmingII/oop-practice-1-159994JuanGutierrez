//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/12/2019
//Hora: 10:43

//Agregando Libreria para poder utilizar el Scanner
import java.util.Scanner;

public class Ejercicio17_Binarios
{

	//Llamando al Scanner para utilizarlo
	static Scanner Binarios = new Scanner(System.in);

	public static void main(String[] ags)
	{
		//Declarando variables de entero
		int binario1,binario2,Reserva = 0,i = 0;
		//Declarando variables de arreglo para depositar el resultado de la operacion
		int[] Resultado  = new int[20];
		int[] Resultado2 = new int[20];
		int[] Resultado3 = new int[20];

		//Preguntando por el primer numero binario
		System.out.println("Ingrese el primer numero binario");
		//Ingresando el primer numero binario
		binario1 = Binarios.nextInt();
		
		//Preguntando por el segundo numero binario
		System.out.println("Ingrese el segundo numero binario");
		//Ingresando el segundo numero binario
		binario2 = Binarios.nextInt();

		while(binario1 != 0 || binario2 != 0)
		{
			

			//Sacando el ultimo valor de binario1
			Resultado[i] = binario1 % 10;
			//Verificando el ultimo numero binario
			System.out.println("Ultimo digito del primer numero binario: " + Resultado[i]);
		
			//Sacando el ultimo valor de binario1
			Resultado2[i] = binario2 % 10;
			//Verificando el ultimo numero binario
			System.out.println("Ultimo digito del segundo numero binario: " + Resultado2[i]);
		
			//Realizando operacion para determinar el numero resultante
			Resultado3[i] = Resultado[i] + Resultado2[i];
				
			//Verificando si hay reserva para aplicarlo en la operacion
			if(Reserva == 1)
			{
				Resultado3[i] = Resultado3[i] + Reserva;
				Reserva = 0;
		
			}

			//Verificando que resultado nunca de un numero mayor a 1
			if(Resultado3[i] >= 2)
			{
				Resultado3[i] = 0;
				Reserva = 1;
			
			}
			

			//Imprimiendo el resultado
			System.out.println("Resultado: " + Resultado3[i]);
			System.out.println("Reserva: " + Reserva);
			//Dividiendo entre 10 para reducir el numero decimal 1 cero
			binario1 = binario1 / 10;
			binario2 = binario2 / 10;
			i++;
			
		
		}
		//Aqui se le resta uno porque esta de sobra en la operacion anterior
		
		//Verificando si se tiene que integrar reserva al arreglo
		if(Reserva == 1)
		{
			Resultado3[i++] = Reserva;
			//Se le resta uno porque en el loop anterior nos sobra un numero de mas
			i--;
			
		}
		else
		{
			//Se le resta uno porque en el loop anterior nos sobra un numero de mas
			i--;
		}


		//Agregando unas palabras para guiar el resultado
		System.out.print("Resultado Final: ");

		//loop para imprimir la respuesta
		while( i >= 0)
		{
		
			System.out.print(Resultado3[i]);
			i--;
		}
		
	}



}
