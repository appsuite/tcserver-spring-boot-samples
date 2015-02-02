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
    return "org.apache.catalina.startup.Tomcat class was loaded from: " + location.toString();
  }
}
