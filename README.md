prototype
=========
Requirements : gradle 1.10 , java 7

Thre project is using 
  <br/>Gradle, 
  <br/>Spring Boot , 
  <br/>Spring WebMVC , 
  <br/>Jetty as runtime container , 
  <br/>Webjars for javascript files managements , 
  <br/>REST using Spring HATEAOS and HAL ,
  <br/>Spring Actuator ( http://docs.spring.io/spring-boot/docs/1.1.3.RELEASE/reference/htmlsingle/#production-ready-endpoints )
  <br/>Jolokia ( http://docs.spring.io/spring-boot/docs/1.1.3.RELEASE/reference/htmlsingle/#production-ready-jolokia )
  <br/>YAML configuration file ( application.yml) for runtime configuration
  
From console please do :
gradle run

Then in your browser
http://localhost:8080/

Here there is an sample using angular js , highcharts , bootstrap and jquery


http://localhost:8080/beans/bla

Here u will see some json REST ( very simple ) with Hypermedia using Spring HATEAOS

