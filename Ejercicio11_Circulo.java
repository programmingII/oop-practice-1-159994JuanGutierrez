//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/6/2019
//Hora: 2:24

public class Ejercicio11_Circulo
{
	public static void main(String[] ags)
	{
		//Declarando variables
		double radio = 7.5,perimetro,area;
		
		//Realizando operaciones y imprimiendo
		perimetro = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio,2);
		System.out.println("El perimetro es = " + perimetro + "\nEl area es = " + area);
	}
}
