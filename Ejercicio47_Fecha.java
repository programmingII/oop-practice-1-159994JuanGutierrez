//Nombre: Juan Pablo Gutierrez Ceballos
//Fecha: 2/27/2019
//Hora: 2:45

//SimpleDateFormat is a concrete class for formatting and parsing dates in a locale-sensitive manner. It allows for formatting (date -> text), parsing (text -> date), and normalization.
import java.text.SimpleDateFormat;
//The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week. An instant in time can be represented by a millisecond value that is an offset from the Epoch, January 1, 1970 00:00:00.000 GMT (Gregorian).
import java.util.Calendar;
//TimeZone represents a time zone offset, and also figures out daylight savings.
import java.util.TimeZone;

public class Ejercicio47_Fecha 
{

	public static void main(String[] args) 
	{
		//Se crea un formato para colocar la fecha
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		//aqui se colocan los datos al formato
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		//se imprime el formato y se le agrega la hora
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	}
}