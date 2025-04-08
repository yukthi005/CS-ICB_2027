import java.io.*;
import java.net.*;

public class ChatServer {
public static void main(String[] args) throws Exception {
ServerSocket serverSocket = new ServerSocket(5456);
System.out.println("Server started. Waiting for client...");
Socket socket = serverSocket.accept();
System.out.println("Client connected.");
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
Encryption encryption = new Encryption();

while (true) {
String encryptedMsg = reader.readLine();
String decryptedMsg = encryption.decrypt(encryptedMsg);
System.out.println("Client: " + decryptedMsg);
System.out.print("You: ");
String reply = consoleReader.readLine();
String encryptedReply = encryption.encrypt(reply);
writer.println(encryptedReply);
}
}
}
