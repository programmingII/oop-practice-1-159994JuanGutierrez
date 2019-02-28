//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 1:13

public class Ejercicio39_3Digitos
{	

	public static void main(String[] ags)
	{
		//Declaramos variables
		int contador = 0;

		//Aqui Utilizamos unos loops para ir cambiando los numeros
		for(int i = 1; i <= 4; i++)
			{
			for(int j = 1; j <= 4; j++)
				{
				for(int k = 1; k <= 4; k++)
					{
					if(k != i && k != j && i != j)
						{
						contador++;
						System.out.println(i + "" + j + "" + k);
						}
					}
				}
			}
		System.out.println("Total number of the three-digit-number is " + contador);
	}
	

}