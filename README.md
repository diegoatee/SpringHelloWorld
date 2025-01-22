# SpringHelloWorld
A simple "Hello World" application using Spring Boot. Inspired by the "quickstart" section on the official Spring Boot Documentation.

In this program, "hello, world!" will be printed on the webpage once the application begins running. If the "name" parameter is defined, then the program will display "hello, {name}!" instead. This is done through the use of the "@RequestParam" annotation.

## Running the application

To run the application on IntelliJ, open "SpringQuickstart" on the IDE and navigate to the SpringQuickstart/src/main/java/com/diegoatee/SpringQuickstart/SpringQuickstartApplication.java on the IDE. Once the program is open, click the green "run" button. This should start the application.

Afterward, visit "http://localhost:8080/hello". You should see the following:

<img width="629" alt="image" src="https://github.com/user-attachments/assets/cfa8ab2b-c3f5-4c99-a6b2-273775c9a9ae" /><br>

Now, visit "http://localhost:8080/hello?name=Pizza". You should see the following:

<img width="752" alt="image" src="https://github.com/user-attachments/assets/62ca2b61-f1a7-41c3-b521-0779dcfe21a5" /> <br>

This was my first "Hello, world" Spring application!

