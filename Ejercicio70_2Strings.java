//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/28/2019
//Hora: 8:05

public class Ejercicio70_2Strings
{
	
		
		public static void main(String[] ags)
		{
			//declaramos strings
			String frase = "Python 3.0";
			String frase2 = "Tutorial"; 
	
			//Creamos una condicional para saber si la primera frase es mayor o igual a la segunda
			if(frase.length() >= frase2.length())
			{
			System.out.println( frase2+frase+frase2);
			}
			else
			{
			System.out.println(frase+frase2+frase);	
			}
		}
			
		

}