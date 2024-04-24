package cliente;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	
	public static void main (String[] args) {
		try 
		{
			Socket clienteSocket = new Socket("teste",7642);
			PrintStream saida = new PrintStream(clienteSocket.getOutputStream() );
			System.out.println("programa 2: cliente");
			Scanner leia = new Scanner(System.in);
			int a = 1 ;
			while(a==1) {
				String msg = leia.nextLine();
				saida.println(msg);
			}
			
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
				
		}
	}
}
