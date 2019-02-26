//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/26/2019
//Hora: 9:57

//Agregamos la libreria del Scanner
import java.util.Scanner;

//Agregamos la libreria Math para poder utilizar numeros especiales
import java.lang.Math;

public class Ejercicio35_AreaPoly
{

	//Agregamos el lugar donde se almacenaran las variables leidas por el teclado
	static Scanner Tamano = new Scanner(System.in);
	
	public static void main(String[] ags)
	{
		
		//Primero se declararan las variables
		Double Lado,LadoTam,Area;
		
		//Preguntaremos por un lado del poligono
		System.out.println("Ingrese la cantidad de lados del poligono");
		
		//Almacenaremos los datos en una variable
		Lado = Tamano.nextDouble();

		//Preguntamos por el tamaño del lado
		System.out.println("Ingrese tamano de los lados");

		//Almacenaremos los datos en una variable
		LadoTam = Tamano.nextDouble();

		//Realizaremos la operacion para sacar el area
		//Utilizamos Math.pow para elevar a una potencia
		//Utilizamos Math.tan para utilizar la tangente
		//Utilizamos Math.PI para utilizar el numero pi
		Area = (Lado*Math.pow(LadoTam,2))/(4*Math.tan(Math.PI/Lado));

		//Imprimimos el resultado
		System.out.print("El resultado es: " + Area);		

	}	

}