package eetac.upc.edu.dsa.Jmale.Servidor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import eetac.upc.edu.dsa.Jmale.Servidor.QueHoraEs;

public class servidor_udp_no_concurrente {

	public static void main(String[] args) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(9876);
		byte[] receiveData = new byte[1024];
		byte[] sendData = new byte[1024];
		QueHoraEs hora = new QueHoraEs();
		
		DatagramPacket receivePacket = new DatagramPacket(receiveData,
				receiveData.length);
		System.out.println("Esperando conexion ...");
		serverSocket.receive(receivePacket);
		String sentence = new String(hora.damelahora());
		System.out.println("Conectado");
		InetAddress IPAddress = receivePacket.getAddress();
		int port = receivePacket.getPort();
		String capitalizedSentence = sentence.toUpperCase();
		sendData = capitalizedSentence.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData,
				sendData.length, IPAddress, port);
		serverSocket.send(sendPacket);
		serverSocket.close();
		System.out.println("FIN");

	}

}
