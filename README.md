#JQuickChat

A simple local network chatting system written in Java where you connect to a chatroom using the chat server’s IP address. The server and client can run on any OS through the JVM. The username in the Operating System level will be used as his/her username in the chat room.

##Starting the server
###Syntax
```
java Main <ip address>
```
###Example
```
java Main 192.168.1.1
```

![server screenshot](http://imgur.com/NzONUHG.png)

##Using the client
**Start the client**   
```
java JQuickChatClientController
```   

![Client screenshot](http://i.imgur.com/LZAfmDy.png)   

**In the menu bar, open:**   
Chat->Connect and enter the server's IP address   

![Client screenshot](http://i.imgur.com/jlHc9RW.png)

**You are now connected**
![Client screenshot](http://i.imgur.com/eTF6h05.png)

##TODO
 * Fix the ugly threading
 * Add user accounts
 * Server administration
