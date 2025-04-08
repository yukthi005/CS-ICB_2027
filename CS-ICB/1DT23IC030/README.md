# 🔐 Java Encrypted Chat Application

A secure, console-based chat application built with Java. This application enables real-time communication between a client and server, with **AES encryption** ensuring privacy and data security.

---

## ✨ Features

- ✅ **AES Encryption**: All messages are encrypted using AES before transmission.
- 🧑‍💻 **Multi-User Chat**: One server can communicate with multiple clients (extendable).
- ⚡ **Fast & Lightweight**: Built with core Java, no external dependencies.
- 🔒 **Secure Messaging**: Encryption key shared within the code (can be enhanced with key exchange algorithms).

---

## 📂 Project Structure

```plaintext
├── src/
│   ├── Encryption.java       # AES encryption/decryption logic
│   ├── ChatServer.java       # Server-side logic for handling clients
│   └── ChatClient.java       # Client-side chat interface
└── README.md                 # Project overview and usage guide
```
## 🛠️ How to Run

1. Compile all .java files
```compile
javac *.java
```
2. Start the Server
```server
java ChatServer
```
3. Launch the Client (in a new terminal or tab)
```launch
java ChatClient
```
## 📸 Preview

Console Preview of Encrypted Message Transmission
```preview
Client: Hello, Server!
Encrypted: uF9wsdl11c9+Z...
Server: Hello, Client!
Encrypted: aLk19skXva1+Z...
```

```
 .-') _       ('-.      _  .-')     .-')    
(  OO) )     ( OO ).-. ( \( -O )   ( OO ).  
/     '._    / . --. /  ,------.  (_)---\_) 
|'--...__)   | \-.  \   |   /`. ' /    _ |  
'--.  .--' .-'-'  |  |  |  /  | | \  :` `.  
   |  |     \| |_.'  |  |  |_.' |  '..`''.) 
   |  |      |  .-.  |  |  .  '.' .-._)   \ 
   |  |      |  | |  |  |  |\  \  \       / 
   `--'      `--' `--'  `--' '--'  `-----'  
```
