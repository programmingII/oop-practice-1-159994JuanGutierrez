//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 3:08


public class Ejercicio50_Divisible
{

	public static void main(String[] args) 
	{

		//Diciendo que empezamos con la de 3
		System.out.println("Division en 3: ");

		//Utilizo loop para saber si el entero es divisible de 3
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0)
			{
				System.out.print(i + " , ");
			}
			
		}

		//Diciendo que empezamos con la de 5
		System.out.println("\nDivision en 5: ");

		//Utilizo loop para saber si el entero es divisible de 5
		for(int i = 1; i <= 100; i++)
		{
			if(i % 5 == 0)
			{
				System.out.print(i + " , ");
			}
			
		}
		
		//Diciendo que empezamos con la de 5 y 3
		System.out.println("\nDivision en 5 y 3: ");

		//Utilizo loop para saber si el entero es divisible de 5 y 3
		for(int i = 1; i <= 100; i++)
		{
			if(i % 5 == 0 && i % 3 == 0)
			{
				System.out.print(i + " , ");
			}
			
		}
	}
}