//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 4:00

//Agregamos la libreria de Scanner
import java.util.Scanner;

public class Ejercicio55_SecToHour
{
	static Scanner numeros = new Scanner(System.in);

	public static void main(String[] args) 
	{

		//Declaramos variables
		int segundos,minutos,horas;
		
		//preguntamos por los segundo
		System.out.print("Ingrese los segundos: ");

		//leemos los segundos
		segundos = numeros.nextInt();

		//Realizamos operaciones
		//Sacamos los minutos que tenemos
		minutos = segundos / 60;

		//Sacamos el restante de segundos
		segundos = segundos % 60;

		//Sacamos las horas que tenemos
		horas = minutos / 60;

		//Sacamos el restante de minutos
		minutos = minutos % 60;

		//imprimimos resultados
		System.out.print(horas + ":" + minutos + ":" + segundos);
		
		

	}
		

	
}