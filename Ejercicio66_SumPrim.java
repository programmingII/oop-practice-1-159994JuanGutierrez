//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 7:32

public class Ejercicio66_SumPrim
{
	
		
		public static void main(String[] ags)
		{

			//Declaramos variables
			int suma = 1,contador = 0, i = 0;

			//Realizamos un loop con una condicional para saber si es primo o no
			do
			{
				i++;
				if((i % 2) != 0)
				{	
					if(EsPrimo(i))
					{		
						System.out.println(i);
						suma = suma + i;
						contador++;
					}
				}
			}
			while(contador < 100);
			//imprimimos resultado
			System.out.println("La suma es: " + suma);		
		
		}
		
		public static boolean EsPrimo(int n)
		{
			for (int i = 3; i * i <= n; i+= 2)
			 {
				if (n % i == 0)
			 	{
					return false; 
				}
			}
		return true;
		}
			
		

}