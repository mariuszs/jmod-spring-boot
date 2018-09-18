[![Build Status](https://travis-ci.org/mariuszs/groovy-spring-boot.svg?branch=master)](https://travis-ci.org/mariuszs/groovy-spring-boot)

Spring Boot App with Java 11
===


Features
---
* Java 11
* Spring Boot 2
* Spock 1.2
* Groovy 2.5


Usage
---

Java 11 is required.

    ./mvnw clean package

    java --add-opens java.base/java.lang=spring.core \ 
      --module-path target/modules \
      --module acme.modapp/com.acme.modapp.ModularizedApplication
      
    curl -i -I http://localhost:8080/                                                                                             wto, 18 wrz 2018, 10:22:16 

    > HTTP/1.1 200 
    > Content-Length: 0
    > Date: Tue, 18 Sep 2018 08:22:18 GMT
    