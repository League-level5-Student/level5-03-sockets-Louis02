package _02_Chat_Application;

import javax.swing.JOptionPane;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class Chat_App {
public static void main(String[] args) {
	
	int response = JOptionPane.showOptionDialog(null, "Do you want to host a server or connect to one", "Host or Join",
			0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Host a server", "Join a server"  }, null); 

}}