package eetac.upc.edu.dsa.Jmale.Servidor;
import java.io.DataOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QueHoraEs extends Thread {
	synchronized public String damelahora(String code) {
		Date fecha = new Date();
		String salida = new String();
		if (code == "1") {
			
			
			
			// Sábado, 21 de septiembre de 2013, 17:07:34
			
			
			
			DateFormat hourdateFormat = new SimpleDateFormat(
					"day, dd de MM de yyyy, HH:mm:ss");
			salida = hourdateFormat.format(fecha);
			
			//FALTA ADAPTAR EL FORMATO!!!!
			
		} else {
			DateFormat hourdateFormat = new SimpleDateFormat(
					" dd/MM/yyyy HH:mm:ss");
			salida = hourdateFormat.format(fecha);
		}
		return salida;
	}

	synchronized public String damelahora() {
		Date fecha = new Date();
		String salida = new String();
		DateFormat hourdateFormat = new SimpleDateFormat(
				" dd/MM/yyyy HH:mm:ss");
		salida = hourdateFormat.format(fecha);
		return salida;
	}
}
