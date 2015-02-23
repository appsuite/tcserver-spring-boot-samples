/*
 * Copyright 2015 Pivotal Software, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.springsource.tcruntime.embedded.bootexample;

import org.apache.catalina.startup.Tomcat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public String index() {
        Class klass = Tomcat.class;
        URL location = klass.getResource('/' + klass.getName().replace('.', '/') + ".class");
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
