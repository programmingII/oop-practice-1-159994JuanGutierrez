//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 2:52

public class Ejercicio48_OddNumbers
{

	public static void main(String[] args) 
	{

		//Realizamos un loop con una condicional para saber si es primo o no
		for( int i = 1 ; i <= 99 ; i++)
		{
			if((i % 2) != 0)
			{	
				System.out.println(i);
			}
		}
	}
}