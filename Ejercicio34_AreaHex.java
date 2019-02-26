//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/26/2019
//Hora: 9:35

//Agregamos la libreria del Scanner
import java.util.Scanner;

//Agregamos la libreria Math para poder utilizar numeros especiales
import java.lang.Math;

public class Ejercicio34_AreaHex
{

	//Agregamos el lugar donde se almacenaran las variables leidas por el teclado
	static Scanner Tamano = new Scanner(System.in);
	
	public static void main(String[] ags)
	{
		
		//Primero se declararan las variables
		Double Lado,Area;
		
		//Preguntaremos por un lado del Hexagono
		System.out.println("Ingrese el primer lado del Hexagono");
		
		//Almacenaremos los datos en una variable
		Lado = Tamano.nextDouble();

		//Realizaremos la operacion para sacar el area
		//Utilizamos Math.pow para elevar a una potencia
		//Utilizamos Math.tan para utilizar la tangente
		//Utilizamos Math.PI para utilizar el numero pi
		Area = (6 * Math.pow(Lado,2))/(4*Math.tan(Math.PI/6));

		//Imprimimos el resultado
		System.out.print("El resultado es: " + Area);		

	}	

}