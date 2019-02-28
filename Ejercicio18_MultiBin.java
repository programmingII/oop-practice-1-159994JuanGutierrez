//Nombre: Juan Pablo Gutierrez Ceballos 
//Fecha:2/14/2019 
//Hora:7:32a.m.

//Agregaremos una libreria para poder utilizar el Scanner
import java.util.Scanner;

public class Ejercicio18_MultiBin
{
	
	static Scanner input = new Scanner(System.in); 

	public static void main(String[] ags)
	{

		//Declarando variables
		//Declarando variables de enteros
		int Binario1,Binario2,RepBin1,Cont0 = 0,k = 0,i = 0;
		//Declarando arreglos de enteros
		int[] Resultado = new int[20];
		int[] mod1 = new int[20];
		int[] mod2 = new int[20];
		int[] mod3 = new int[20];
		int[] mod4 = new int[20];
		int[] Finales = new int[20];
		
		//Primero preguntare por los numeros
		System.out.println("Ingrese el primer numero binario");
		//Agregamos esta variable a la memoria
		Binario1 = input.nextInt();
	
		//Preguntaremos por el segundo numero Binario
		System.out.println("Ingrese el segundo numero Binario");
		//Agregaremos esta variable a la memoria
		Binario2 = input.nextInt();

		//Creamos un Backup del numero binario1 ya que se utiliza mas de una vez
		RepBin1 = Binario1;

		
		//Este loop es para que se vaya reduciendo el numero de Binario2 y vaya avanzando la operacion
		for(int j = 0 ; Binario2 != 0; j++)
		{
			//Utilizamos el repuesto para recuperar el binario1
			Binario1 = RepBin1;
			//Sacamos el ultimo numero de binario para multiplicarlo por los otros binarios
			mod1[j] = Binario2 % 10;
			//Este loop lo utilizo para poder sacar la operacion por linea
			while(Binario1 != 0)
			{
				//se separa el ultimo digito del binario1 para multiplicarlo
				mod2[i] = mod1[j]*(Binario1 % 10);
				//Verifico con una impresion en pantalla que lo que estoy haciendo sea correcto
				//System.out.print(mod2[i]);
				//Divido entre 10 el binario1 para poder quitar el ultimo numero que ya utilice
				Binario1 = Binario1 / 10;
				//Lo utilizo solo para que siga en movimiento el loop con un contador
				i++;
				
			}
			//Guardamos el primer resultado en un arreglo
			while (i >= 0)
			{
				Finales[k] = Finales[k] + mod2[i--];
				Finales[k] = Finales[k] * 10;
			}
			//Finales[k] lo divimos sobre 10 para eliminar el ultimo 0 que queda
			Finales[k] = Finales[k] / 10;
			System.out.println(Finales[k]);
			//sumamos 1 a k para que avance el loop anterior
			k++;


			//Imprimo algo para poder verificar que si esta sucediendo la operacion por linea
			//System.out.println("\nSaltamos");
			//Dividimos entre 10 para reducir el numero
			Binario2 = Binario2 / 10;
			//Reiniciamos i
			i = 0;
			//Esta variable me cuenta los 0 para despues realizar la suma de binarios
			Cont0++;
			

		}
		//Quitamos una unidad que nos sobra al contador de 0s	
		Cont0--;
		//Hago un respaldo de Cont0++ para despues
		RepBin1 = Cont0;
		//Reseteo las variables i necesito utilizarla y por el momento ya no tiene funcion
		i = 0;
		k = 0;
		//imprimimos que apartir de aqui empieza la suma
		System.out.println("Apartir de aqui empieza la suma");
		//Separaremos los valores que tenemos para poder agregar los respectivos 0s
		if( k == 0)
		{
			while(Cont0 != 0)
			{
				//En la primera linea vamos a agregar todo el valor de Cont0
				mod1[i] = 0;
				Cont0--;
				System.out.print(mod1[i]);
				i++;
			}
			//en este loop vamos a agregar el digito correspondiente
			while(Finales[0] != 0)
			{
				mod1[i] = Finales[k] % 10;
				Finales[k] = Finales[k] / 10;
				System.out.print(mod1[i]);
				i++;
			}
		}
		k++;
		i = 0;
		Cont0 = RepBin1;
		System.out.println("");
		if (k == 1)
		{
			while(Cont0 != 1)
			{
				//Agregaremos los 0s donde corresponden
				mod2[i] = 0;
				Cont0--;
				System.out.print(mod2[i]);
				i++;
			}
			//en este loop vamos a agregar el digito correspondiente
			while(Finales[k] != 0)
			{
				mod2[i] = Finales[k] % 10;
				Finales[k] = Finales[k] / 10;
				System.out.print(mod2[i]);
				i++;
			}
			mod2[i++] = Cont0--;
		}
		k++;
		i = 0;
		Cont0 = RepBin1;
		System.out.println("");
		if (k == 2)
		{
			while(Cont0 != 2)
			{
				//Agregaremos los 0s donde corresponden
				mod3[i] = 0;
				Cont0--;
				System.out.print(mod3[i]);
				i++;
			}
			
			//en este loop vamos a agregar el digito correspondiente
			while(Finales[k] != 0)
			{
				mod3[i] = Finales[k] % 10;
				Finales[k] = Finales[k] / 10;
				System.out.print(mod3[i]);
				i++;
			}
			mod3[i++] = 0;
			System.out.print(mod3[i]);
			mod3[i++] = 0;
			System.out.print(mod3[i]);
			Cont0 = 0;

		}
		k++;
		i = 0;
		Cont0 = RepBin1;
		System.out.println("");
		if (k == 3)
		{
			//en este loop vamos a agregar el digito correspondiente
			while(Finales[k] != 0)
			{
				mod4[i] = Finales[k] % 10;
				Finales[k] = Finales[k] / 10;
				System.out.print(mod4[i]);
				i++;
			}
			mod4[i++] = 0;
			System.out.print(mod4[i]);
			mod4[i++] = 0;
			System.out.print(mod4[i]);
			mod4[i++] = 0;
			System.out.print(mod4[i]);			
		} 
		
	
	

	}
	


}
