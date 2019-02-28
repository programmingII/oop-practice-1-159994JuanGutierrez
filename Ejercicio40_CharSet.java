//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 1:13

//Defines charsets, decoders, and encoders, for translating between bytes and Unicode characters.
import java.nio.charset.Charset;

public class Ejercicio40_CharSet
{	

	public static void main(String[] ags)
	{
		System.out.println("Lista de caracteres disponibles: "); 
 
    		for (String str : Charset.availableCharsets().keySet())
		{

      			System.out.println(str);

		}
	}
	

}