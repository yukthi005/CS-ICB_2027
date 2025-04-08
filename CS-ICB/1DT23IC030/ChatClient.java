import java.io.*;
import java.net.*;

public class ChatClient {
public static void main(String[] args) throws Exception {
Socket socket = new Socket("localhost", 5456);
System.out.println("Connected to server.");
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
Encryption encryption = new Encryption();

while (true) {
System.out.print("You: ");
String message = consoleReader.readLine();
String encryptedMsg = encryption.encrypt(message);
writer.println(encryptedMsg);
String encryptedReply = reader.readLine();
String decryptedReply = encryption.decrypt(encryptedReply);
System.out.println("Server: " + decryptedReply);
}
}
}
