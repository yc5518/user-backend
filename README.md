# user-server
The server is basically a microservice started by Springboot.

The microservice provides searching all users, fuzzy search user name, search single user info and update single user info. May have some flaws in returning user info.

It is a maven project developed by Java, MySql, mybatis, Springboot. You can import the project as a maven project, maven build the project and run the server by running main method in Demo1Application class.

Before you run the server, you must import database sql under src/main/resources to make sure a database is ready.

## APIs:
1. HTTP GET http://localhost:8080/demo/v1/users   -    query user list
2. HTTP GET http://localhost:8080/demo/v1/users/{id}  -   query single user info
3. HTTP PUT http://localhost:8080/demo/v1/users/{id}   -   update single user info

## Things need to consider
Althought I tried to finish the whole project, due to time limit and I was travelling from Beijing to Auckland(I'm now in Aucklank from Saturday), there are still missing points.
1. Unit test to be finished.   -- junit
2. Logging --- log4j
3. Better dealing with exceptions
4. Input checks   -- more logics
5. Security  --- token checks
6. yaml   ---  swagger.io
7. etc

Thank you for effort in reviewing my code.
