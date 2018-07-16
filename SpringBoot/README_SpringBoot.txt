
/////////////////////////////////////////////////////////////
/// Running Spring Boot Application ///////////////////////// 
/////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////
1.0) Running Spring Boot Application on command line

1.1)Go into the root directory of the application. 
Nore: root_directorey: Where the pom.xml is residing

1.2) Run this command: 
$ mvn spring-boot:run


////////////////////////////////////////////////////////////
2.0) packaging the Spring Boot Application for deployments 

2.1)Go into the root directory of the application. 

2.2) Run this command for making the jar package in target directory 
$ mvn package 

2.3) It will create jar in the location:
target/<application_name_varesion>.jar

2.4) Copy this jar to the server/machine/location wherever you want to run this. Run this command
$ java -jar <application_name_varesion>.jar

