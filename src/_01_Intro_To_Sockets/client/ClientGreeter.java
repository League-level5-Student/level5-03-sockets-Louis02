package _01_Intro_To_Sockets.client;

import java.net.*;

import javax.swing.JOptionPane;

import java.io.*;

public class ClientGreeter {

	public static void main(String[] args) {

		// 1. Create a String for the ip address of the server.
		// If you don't know how to find a computer's ip address, ask about ifconfig on
		// linux/mac and ipconfig on windows.
		String ipAdress = JOptionPane.showInputDialog("Please enter your IP Adress");
		// 2. Create an integer for the server's port number
		String aaa = JOptionPane.showInputDialog("Please enter your port number");
		int portNum = Integer.parseInt(aaa);
		// 3. Surround steps 4-9 in a try-catch block that catches any IOExceptions.

		try {

			// 4. Create an object of the Socket class. When initializing the object, pass
			// in the ip address and the port number
			Socket sckt = new Socket(ipAdress, portNum);
			// 5. Create a DataOutputStream object. When initializing it, use the Socket
			// object you created in step 4 to call the getOutputStream() method.
			DataOutputStream dos = new DataOutputStream(sckt.getOutputStream());
			// 6. Use the DataOutputStream object to send a message to the server using the
			// writeUTF(String message) method
			String mess = JOptionPane.showInputDialog("Enter a messagw to send to the server");
			dos.writeUTF(mess);
			// 7. Create a DataInputStream object. When initializing it, use the Server
			// object you created in step 4 to call the getInputStream() method.
			DataInputStream dis = new DataInputStream(sckt.getInputStream());
			// 8. Use the DataInputStream object to print a message from the server using
			// the readUTF() method.
			dis.readUTF();
			// 9. Close the client's server object
			sckt.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException");
		}
	}
}
