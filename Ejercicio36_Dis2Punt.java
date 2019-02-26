//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/26/2019
//Hora: 10:04

//Agregamos la libreria del Scanner
import java.util.Scanner;

//Agregamos la libreria Math para poder utilizar numeros especiales
import java.lang.Math;

public class Ejercicio36_Dis2Punt
{

	//Agregamos el lugar donde se almacenaran las variables leidas por el teclado
	static Scanner Tamano = new Scanner(System.in);
	
	public static void main(String[] ags)
	{
		
		//Primero se declararan las variables
		Double x1, y1, x2, y2,Distancia;
		
		//Preguntaremos por un las coordenadas
		System.out.println("Ingrese las coordenadas");
		
		//Almacenaremos los datos de las coordenadas
		System.out.print("x1 = ");
		x1 = Tamano.nextDouble();
		System.out.print("y1 = ");
		y1 = Tamano.nextDouble();
		System.out.print("x2 = ");
		x2 = Tamano.nextDouble();
		System.out.print("y2 = ");
		y2 = Tamano.nextDouble();
	
		//Convertimos los valores a radianes antes de hacer a operacion
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		//Realizamos la operacion de la distancia
		Distancia =  6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		//Imprimimos el resultado
		System.out.print("la distancia entre 2 puntos es: " + Distancia + " km");		

	}	

}