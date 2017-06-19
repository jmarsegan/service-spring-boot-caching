Launch :
 - cd service-spring-boot-data-jpa
 - mvn spring-boot:run
 
 Endpoints : 
  - GET http://localhost:8080/api/find/test without cache annotation
  - GET http://localhost:8080/api/find/test with cache annotation

 Swagger :
  - GET http://localhost:8080/system/
  
 Devtools :
  - live restart
  
 Unit Test :
  - WebEnvironment.RANDOM_PORT
  
 Jersey Config :
  - register(LoggingFeature.class)
