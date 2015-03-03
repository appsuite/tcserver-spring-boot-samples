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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class ExampleController {
    private final static String JAR_PATTERN = ".*(com\\.springsource\\.org\\.apache\\.tomcat\\.embed\\.core\\-)(.*)(\\.jar).*";
    private final Pattern pattern = Pattern.compile(JAR_PATTERN);

    @RequestMapping("/")
    public String index() {
        Class klass = Tomcat.class;
        String location = klass.getResource('/' + klass.getName().replace('.', '/') + ".class").toString();
        Matcher m = pattern.matcher(location);
        if (m.matches()) {
            return "You are running tc Server Runtime Embedded Version: " + m.group(2) + System.getProperty("line.separator");
        } else {
            return "You are not running a recognized version of tc Server Embedded" + System.getProperty("line.separator");
        }
    }
}
