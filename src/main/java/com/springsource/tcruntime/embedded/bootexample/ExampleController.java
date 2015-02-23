package com.springsource.tcruntime.embedded.bootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.apache.catalina.startup.Tomcat;
import java.net.URL;

@RestController
public class ExampleController {

  @RequestMapping("/")
  public String index() {
    Class klass = Tomcat.class;
    URL location = klass.getResource('/'+klass.getName().replace('.', '/')+".class");
      StringBuilder sb = new StringBuilder();
      sb.append("Greetings from spring-boot-starter-tcserver-example! \n");
      sb.append("This example will show the jar which loads the ");
      sb.append(Tomcat.class.toString());
      sb.append(". Please verify you see the jar file (com.springsource.org.apache.tomcat.embed.core-<version>.jar)");
      sb.append("on the next line\n");
      sb.append(location.toString() + "\n");
    return sb.toString();
  }
}
