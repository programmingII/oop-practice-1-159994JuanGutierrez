//
//Fecha: 2/21/19
//Hora: 8:50p.m

//Agregamos la libreria de Scanner (nos leera las teclas de teclado)
import java.util.Scanner;

public class Ejercicio18_MultBin
{

	//Esto nos dice que vamos a agregar datos a una variable por medio del teclado
	static Scanner Binario = new Scanner(System.in);	

	public static void main(String[] ags)
	{
		//Declarando variable
		int Decimal1, Decimal2, Resultado1;
		String Binario1, Binario2, ResultadoBin;
		
		//Preguntare por el primer numero binario
		System.out.println("Deme su primer numero binario");
		
		//Introduciremos los datos a la variable
		Binario1 = Binario.nextLine();

		//Preguntamos por el segundo numero binario
		System.out.println("Deme se segundo numero binario");

		//Introducimo los datos a la variable
		Binario2 = Binario.nextLine();

		//Realizando la operacion para cambiar los numeros binarios a decimale
		Decimal1 = Integer.parseInt(Binario1, 2);
		Decimal2 = Integer.parseInt(Binario2, 2);
		
		//Ahora hacemos la multiplicacion
		Resultado1 = Decimal1 * Decimal2;

		//Imprimiendo resultado y convirtiendo el decimal a binario
		System.out.println("El resultado es: " + Integer.toBinaryString(Resultado1));
		

		
	}	
}