# das-boot
Baby steps into learning spring boot application


How to run?
1) Import into IntelliJ
2) Run App.java
3) Go to web browser and type http://localhost:8080/index.html#/

Once h2 is configured in pom.xml
1) Access h2 console via http://localhost:8080/h2 as mentioned in the application.properties.



Problems encountered:
Despite adding the dependency, observed that h2 and hibernate was not set up, and /h2 kept throwing the route not found error.
Fix: Noticed that the spring-boot-starter-data-jpa dependency was added in after h2 dependency, this was the problem, and changing the order fixed the issue.

Database migrations: What and how?
https://flywaydb.org/getstarted/why

JDBC pooling:
Connection pooling is a mechanism to create and maintain a collection of JDBC connection objects. The primary objective of maintaining the pool of connection object is to leverage re-usability. A new connection object is created only when there are no connection objects available to reuse. This technique can improve overall performance of the application.
