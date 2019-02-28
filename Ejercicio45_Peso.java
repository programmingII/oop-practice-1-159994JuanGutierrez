//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 2:24

//An abstract representation of file and directory pathnames.
import java.io.File;

public class Ejercicio45_Peso
{	


	public static void main(String[] ags)
	{
		
		//imprimimos resultados
		//new file crea un nuevo archivo
		System.out.println("C:/Users/ENEMY/Desktop/Tareas/150_Programas/Ejercicio2_SumaNumeros.txt : " + new File("abc.txt").length() + "bytes");
		System.out.println("C:/Users/ENEMY/Desktop/Tareas/150_Programas/Ejercicio3_DivisionNumeros.txt : " + new File("test.txt").length() + "bytes");
	}

}