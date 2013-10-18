package eetac.upc.edu.dsa.Jmale.Servidor;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import eetac.upc.edu.dsa.Jmale.Servidor.QueHoraEs;

class servidor_tcp_concurrente {
	static int puerto = 6789;

	public static void main(String argv[]) throws Exception {
		String clientSentence;
		QueHoraEs hora = new QueHoraEs();
		String capitalizedSentence;
		ServerSocket welcomeSocket = new ServerSocket(puerto);
		while (true) {
			System.out.println("Esperando conexion...");
			Socket connectionSocket = welcomeSocket.accept();
			System.out.println("DENTRO!!!");
			DataOutputStream outToClient = new DataOutputStream(
					connectionSocket.getOutputStream());
			clientSentence = hora.damelahora();
			capitalizedSentence = clientSentence.toUpperCase() + '\n';
			outToClient.writeBytes(capitalizedSentence);
		}
	}
}
