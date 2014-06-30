prototype
=========
Requirements : gradle 1.10 , java 7

Thre project is using 
  Gradle , 
  Spring Boot , 
  Spring WebMVC , 
  Jetty as runtime container , 
  Webjars for javascript files managements , 
  REST using Spring HATEAOS and HAL ,
  Spring Actuator ( http://docs.spring.io/spring-boot/docs/1.1.3.RELEASE/reference/htmlsingle/#production-ready-endpoints )
  Jolokia ( http://docs.spring.io/spring-boot/docs/1.1.3.RELEASE/reference/htmlsingle/#production-ready-jolokia )
  YAML configuration file ( application.yml) for runtime configuration
  
From console please do :
gradle run

Then in your browser
http://localhost:8080/

Here there is an sample using angular js , highcharts , bootstrap and jquery


http://localhost:8080/beans/bla

Here u will see some json REST ( very simple ) with Hypermedia using Spring HATEAOS

