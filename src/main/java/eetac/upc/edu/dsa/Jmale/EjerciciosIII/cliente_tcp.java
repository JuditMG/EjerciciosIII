package eetac.upc.edu.dsa.Jmale.EjerciciosIII;

import java.io.*;
import java.net.*;

class cliente_tcp {
	
	static String direccion = "localhost";
	static int puerto = 6789;

	public static void main(String argv[]) throws Exception {
		String modifiedSentence;
		Socket clientSocket = new Socket(direccion, puerto);
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));
		modifiedSentence = inFromServer.readLine();
		System.out.println("FROM SERVER: " + modifiedSentence);
		inFromServer.close();
		clientSocket.close();
	}
}