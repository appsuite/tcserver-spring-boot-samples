# tcserver-spring-boot-sample-actuator

This is a sample application using the tcserver-spring-boot-actuator. This actuator provides a json formatted output of all the tc Runtime related mbeans registered. The data provided by this actuator is subject to change in later releases to provide more streamlined data.

Prerequisites
=============

To use this sample you should read the parent repository [README.md](../README) which contains information on configuring the needed repositories.

Usage
=====

This sample itself does nothing other than start a web application which has enabled the tcserver-spring-boot-actuator. 

As with most Spring Boot Applications you may invoke this example via maven with

```
mvn spring-boot:run
```

By default this will start the sample web application on port 8080. 

The tc Server actuator is available via http://localhost:8080/tcserver/

```
curl http://localhost:8080/tcserver/
```

This will produce a large amount of JSON formatted data. You may view it in any JSON viewer or as plain text.

Example JSON Data:

```json
[
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "context=/,host=localhost,type=Loader",
            "canonicalName": "Tomcat:context=/,host=localhost,type=Loader",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "context": "/",
                "host": "localhost",
                "type": "Loader"
            },
            "keyPropertyListString": "type=Loader,host=localhost,context=/",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=requestContextFilter",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=requestContextFilter",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Filter",
                "name": "requestContextFilter"
            },
            "keyPropertyListString": "j2eeType=Filter,WebModule=//localhost/,name=requestContextFilter,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "realmPath=/realm0,type=Realm",
            "canonicalName": "Tomcat:realmPath=/realm0,type=Realm",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "realmPath": "/realm0",
                "type": "Realm"
            },
            "keyPropertyListString": "type=Realm,realmPath=/realm0",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "name=StandardEngineValve,type=Valve",
            "canonicalName": "Tomcat:name=StandardEngineValve,type=Valve",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "name": "StandardEngineValve",
                "type": "Valve"
            },
            "keyPropertyListString": "type=Valve,name=StandardEngineValve",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=metricFilter",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=metricFilter",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Filter",
                "name": "metricFilter"
            },
            "keyPropertyListString": "j2eeType=Filter,WebModule=//localhost/,name=metricFilter,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=httpPutFormContentFilter",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=httpPutFormContentFilter",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Filter",
                "name": "httpPutFormContentFilter"
            },
            "keyPropertyListString": "j2eeType=Filter,WebModule=//localhost/,name=httpPutFormContentFilter,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "name=HttpRequest1,type=RequestProcessor,worker=\"http-nio-8080\"",
            "canonicalName": "Tomcat:name=HttpRequest1,type=RequestProcessor,worker=\"http-nio-8080\"",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "name": "HttpRequest1",
                "type": "RequestProcessor",
                "worker": "\"http-nio-8080\""
            },
            "keyPropertyListString": "type=RequestProcessor,worker=\"http-nio-8080\",name=HttpRequest1",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "port=8080,type=ProtocolHandler",
            "canonicalName": "Tomcat:port=8080,type=ProtocolHandler",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "port": "8080",
                "type": "ProtocolHandler"
            },
            "keyPropertyListString": "type=ProtocolHandler,port=8080",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.catalina.mbeans.NamingResourcesMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "context=/,host=localhost,type=NamingResources",
            "canonicalName": "Tomcat:context=/,host=localhost,type=NamingResources",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "context": "/",
                "host": "localhost",
                "type": "NamingResources"
            },
            "keyPropertyListString": "type=NamingResources,host=localhost,context=/",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "name=\"http-nio-8080\",type=GlobalRequestProcessor",
            "canonicalName": "Tomcat:name=\"http-nio-8080\",type=GlobalRequestProcessor",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "name": "\"http-nio-8080\"",
                "type": "GlobalRequestProcessor"
            },
            "keyPropertyListString": "type=GlobalRequestProcessor,name=\"http-nio-8080\"",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.catalina.mbeans.ConnectorMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "port=8080,type=Connector",
            "canonicalName": "Tomcat:port=8080,type=Connector",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "port": "8080",
                "type": "Connector"
            },
            "keyPropertyListString": "type=Connector,port=8080",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "context=/,host=localhost,name=StandardContextValve,type=Valve",
            "canonicalName": "Tomcat:context=/,host=localhost,name=StandardContextValve,type=Valve",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "context": "/",
                "host": "localhost",
                "name": "StandardContextValve",
                "type": "Valve"
            },
            "keyPropertyListString": "type=Valve,host=localhost,context=/,name=StandardContextValve",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.catalina.mbeans.ContainerMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Servlet,name=default",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Servlet,name=default",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Servlet",
                "name": "default"
            },
            "keyPropertyListString": "j2eeType=Servlet,WebModule=//localhost/,name=default,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "type=Mapper",
            "canonicalName": "Tomcat:type=Mapper",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "type": "Mapper"
            },
            "keyPropertyListString": "type=Mapper",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.catalina.mbeans.NamingResourcesMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "type=NamingResources",
            "canonicalName": "Tomcat:type=NamingResources",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "type": "NamingResources"
            },
            "keyPropertyListString": "type=NamingResources",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,j2eeType=WebModule,name=//localhost/",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,j2eeType=WebModule,name=//localhost/",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "j2eeType": "WebModule",
                "name": "//localhost/"
            },
            "keyPropertyListString": "j2eeType=WebModule,name=//localhost/,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "context=/,host=localhost,name=Cache,type=WebResourceRoot",
            "canonicalName": "Tomcat:context=/,host=localhost,name=Cache,type=WebResourceRoot",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "context": "/",
                "host": "localhost",
                "name": "Cache",
                "type": "WebResourceRoot"
            },
            "keyPropertyListString": "type=WebResourceRoot,host=localhost,context=/,name=Cache",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=applicationContextIdFilter",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=applicationContextIdFilter",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Filter",
                "name": "applicationContextIdFilter"
            },
            "keyPropertyListString": "j2eeType=Filter,WebModule=//localhost/,name=applicationContextIdFilter,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "type=MBeanFactory",
            "canonicalName": "Tomcat:type=MBeanFactory",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "type": "MBeanFactory"
            },
            "keyPropertyListString": "type=MBeanFactory",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "type=Server",
            "canonicalName": "Tomcat:type=Server",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "type": "Server"
            },
            "keyPropertyListString": "type=Server",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.catalina.mbeans.ContainerMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "host=localhost,type=Host",
            "canonicalName": "Tomcat:host=localhost,type=Host",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "host": "localhost",
                "type": "Host"
            },
            "keyPropertyListString": "type=Host,host=localhost",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "type=StringCache",
            "canonicalName": "Tomcat:type=StringCache",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "type": "StringCache"
            },
            "keyPropertyListString": "type=StringCache",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.catalina.mbeans.ContainerMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "type=Engine",
            "canonicalName": "Tomcat:type=Engine",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "type": "Engine"
            },
            "keyPropertyListString": "type=Engine",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "host=localhost,name=ErrorReportValve,type=Valve",
            "canonicalName": "Tomcat:host=localhost,name=ErrorReportValve,type=Valve",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "host": "localhost",
                "name": "ErrorReportValve",
                "type": "Valve"
            },
            "keyPropertyListString": "type=Valve,host=localhost,name=ErrorReportValve",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.catalina.mbeans.ContainerMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Servlet,name=dispatcherServlet",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Servlet,name=dispatcherServlet",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Servlet",
                "name": "dispatcherServlet"
            },
            "keyPropertyListString": "j2eeType=Servlet,WebModule=//localhost/,name=dispatcherServlet,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "name=\"http-nio-8080\",type=ThreadPool",
            "canonicalName": "Tomcat:name=\"http-nio-8080\",type=ThreadPool",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "name": "\"http-nio-8080\"",
                "type": "ThreadPool"
            },
            "keyPropertyListString": "type=ThreadPool,name=\"http-nio-8080\"",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.catalina.mbeans.ServiceMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "type=Service",
            "canonicalName": "Tomcat:type=Service",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "type": "Service"
            },
            "keyPropertyListString": "type=Service",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=characterEncodingFilter",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=characterEncodingFilter",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Filter",
                "name": "characterEncodingFilter"
            },
            "keyPropertyListString": "j2eeType=Filter,WebModule=//localhost/,name=characterEncodingFilter,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "context=/,host=localhost,type=WebResourceRoot",
            "canonicalName": "Tomcat:context=/,host=localhost,type=WebResourceRoot",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "context": "/",
                "host": "localhost",
                "type": "WebResourceRoot"
            },
            "keyPropertyListString": "type=WebResourceRoot,host=localhost,context=/",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "context=/,host=localhost,type=Manager",
            "canonicalName": "Tomcat:context=/,host=localhost,type=Manager",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "context": "/",
                "host": "localhost",
                "type": "Manager"
            },
            "keyPropertyListString": "type=Manager,host=localhost,context=/",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=webRequestLoggingFilter",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=webRequestLoggingFilter",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Filter",
                "name": "webRequestLoggingFilter"
            },
            "keyPropertyListString": "j2eeType=Filter,WebModule=//localhost/,name=webRequestLoggingFilter,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "context=/,host=localhost,name=NonLoginAuthenticator,type=Valve",
            "canonicalName": "Tomcat:context=/,host=localhost,name=NonLoginAuthenticator,type=Valve",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "context": "/",
                "host": "localhost",
                "name": "NonLoginAuthenticator",
                "type": "Valve"
            },
            "keyPropertyListString": "type=Valve,host=localhost,context=/,name=NonLoginAuthenticator",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "host=localhost,name=StandardHostValve,type=Valve",
            "canonicalName": "Tomcat:host=localhost,name=StandardHostValve,type=Valve",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "host": "localhost",
                "name": "StandardHostValve",
                "type": "Valve"
            },
            "keyPropertyListString": "type=Valve,host=localhost,name=StandardHostValve",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "context=/,host=localhost,type=TomcatEmbeddedWebappClassLoader",
            "canonicalName": "Tomcat:context=/,host=localhost,type=TomcatEmbeddedWebappClassLoader",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "context": "/",
                "host": "localhost",
                "type": "TomcatEmbeddedWebappClassLoader"
            },
            "keyPropertyListString": "type=TomcatEmbeddedWebappClassLoader,host=localhost,context=/",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=Tomcat WebSocket (JSR356) Filter",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=Tomcat WebSocket (JSR356) Filter",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Filter",
                "name": "Tomcat WebSocket (JSR356) Filter"
            },
            "keyPropertyListString": "j2eeType=Filter,WebModule=//localhost/,name=Tomcat WebSocket (JSR356) Filter,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    },
    {
        "className": "org.apache.tomcat.util.modeler.BaseModelMBean",
        "objectName": {
            "canonicalKeyPropertyListString": "J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=hiddenHttpMethodFilter",
            "canonicalName": "Tomcat:J2EEApplication=none,J2EEServer=none,WebModule=//localhost/,j2eeType=Filter,name=hiddenHttpMethodFilter",
            "domain": "Tomcat",
            "domainPattern": false,
            "keyPropertyList": {
                "J2EEApplication": "none",
                "J2EEServer": "none",
                "WebModule": "//localhost/",
                "j2eeType": "Filter",
                "name": "hiddenHttpMethodFilter"
            },
            "keyPropertyListString": "j2eeType=Filter,WebModule=//localhost/,name=hiddenHttpMethodFilter,J2EEApplication=none,J2EEServer=none",
            "pattern": false,
            "propertyListPattern": false,
            "propertyPattern": false,
            "propertyValuePattern": false
        }
    }
]

```

Documentation References
==========

* Spring Boot - [https://docs.spring.io/spring-boot/docs/1.2.2.RELEASE/reference/htmlsingle/]()
* tc Server -  [https://tcserver.docs.pivotal.io/index.html]()

License
=======
The sample code in this repository is licensed under the Apache Software License 2.0
