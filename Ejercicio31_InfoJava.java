//
//Fecha: 2/21/19
//Hora: 10:17p.m

public class Ejercicio31_InfoJava
{
	

	public static void main(String[] ags)
	{
		//Imprimiendo la version de java
		System.out.println("Java Version: " + System.getProperty("java.version"));

		//Imprimiendo la runtime version de java
		System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
		
		//Imprimiendo java home
		System.out.println("Java Home: " + System.getProperty("java.home"));
	
		//Imprimiendo java vendor
		System.out.println("Java Vendor: " + System.getProperty("java.vendor"));

		//Imprimiendo java vendor url
		System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));

		System.out.println("Java Class Path: " + System.getProperty("java.Class.Path"));
	}	
}