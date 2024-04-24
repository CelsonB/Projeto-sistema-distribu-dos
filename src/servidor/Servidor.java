package servidor;


import java.net.Socket;
import java.net.ServerSocket;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args){
		
		try 
		{	System.out.println("programa 1: servidor");
			ServerSocket servidorSocket = new ServerSocket(7642,5);
			Socket ss=servidorSocket.accept();  
			System.out.println("conectado");
			
			
			InputStreamReader inputReader = new InputStreamReader(ss.getInputStream());
			BufferedReader reader = new BufferedReader(inputReader);
			String x; 
			
			while ( (x = reader.readLine()) != null ) {
				
				System.out.println("Servidor: " + x );
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
				
		}
				
		
		
		
		//DataInputStream inbound = new DataInputStream(ss.getInputStream());
		//DataOutputStream outbound = new DataOutputStream(ss.getOutputStream());
	}

}
	