# coursesclient3

**Getting the class in Clojure.**

[Converting between clojure data structures and java collections](https://www.niwi.nz/2013/10/13/converting-between-clojure-data-structures-and-java-collections/)
A Clojure version of the courses client Java and Scala programs.

**Here is the problem I am seeing.**

/usr/lib/jvm/java-1.8.0-openjdk-amd64/bin/java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:46741,suspend=y,server=n -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/management-agent.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/rt.jar:/home/algotrader/coursesclient3/target/classes:/home/algotrader/coursesclient3/lib/clojure-1.8.0.jar:/home/algotrader/coursesclient3/lib/javax.json.jar:/home/algotrader/coursesclient3/lib/hibernate-validator-cdi-5.0.1.Final.jar:/home/algotrader/coursesclient3/lib/validation-api-1.1.0.Final.jar:/home/algotrader/coursesclient3/lib/hibernate-validator-annotation-processor-5.0.1.Final.jar:/home/algotrader/coursesclient3/lib/hibernate-validator-5.0.1.Final.jar:/home/algotrader/coursesclient3/lib/jboss-logging-3.1.1.GA.jar:/home/algotrader/coursesclient3/lib/classmate-0.8.0.jar:/home/algotrader/coursesclient3/lib/javax.el-api-2.2.4.jar:/home/algotrader/.m2/repository/com/sun/jersey/jersey-client/1.19.3/jersey-client-1.19.3.jar:/home/algotrader/.m2/repository/com/sun/jersey/jersey-core/1.19.3/jersey-core-1.19.3.jar:/home/algotrader/.m2/repository/javax/ws/rs/jsr311-api/1.1.1/jsr311-api-1.1.1.jar:/home/algotrader/.m2/repository/com/sun/jersey/jersey-json/1.18.1/jersey-json-1.18.1.jar:/home/algotrader/.m2/repository/org/codehaus/jettison/jettison/1.1/jettison-1.1.jar:/home/algotrader/.m2/repository/com/sun/xml/bind/jaxb-impl/2.2.3-1/jaxb-impl-2.2.3-1.jar:/home/algotrader/.m2/repository/javax/xml/bind/jaxb-api/2.2.2/jaxb-api-2.2.2.jar:/home/algotrader/.m2/repository/javax/xml/stream/stax-api/1.0-2/stax-api-1.0-2.jar:/home/algotrader/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar:/home/algotrader/.m2/repository/org/codehaus/jackson/jackson-core-asl/1.9.2/jackson-core-asl-1.9.2.jar:/home/algotrader/.m2/repository/org/codehaus/jackson/jackson-mapper-asl/1.9.2/jackson-mapper-asl-1.9.2.jar:/home/algotrader/.m2/repository/org/codehaus/jackson/jackson-jaxrs/1.9.2/jackson-jaxrs-1.9.2.jar:/home/algotrader/.m2/repository/org/codehaus/jackson/jackson-xc/1.9.2/jackson-xc-1.9.2.jar:/home/algotrader/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.7.8/jackson-databind-2.7.8.jar:/home/algotrader/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.7.0/jackson-annotations-2.7.0.jar:/home/algotrader/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.7.8/jackson-core-2.7.8.jar:/home/algotrader/.m2/repository/org/mortbay/jetty/jetty-util/6.1.25/jetty-util-6.1.25.jar:/home/algotrader/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/home/algotrader/.m2/repository/ch/qos/logback/logback-classic/1.0.13/logback-classic-1.0.13.jar:/home/algotrader/.m2/repository/ch/qos/logback/logback-core/1.0.13/logback-core-1.0.13.jar:/home/algotrader/.m2/repository/org/apache/httpcomponents/httpcore/4.0.1/httpcore-4.0.1.jar:/home/algotrader/.m2/repository/org/scala-lang/scala-library/2.12.2/scala-library-2.12.2.jar:/home/algotrader/.m2/repository/org/clojure/clojure/1.8.0/clojure-1.8.0.jar:/home/algotrader/.local/share/JetBrains/Toolbox/apps/IDEA-U/ch-0/171.4249.39/lib/idea_rt.jar edu.webdev.CoursesClientRequest
Connected to the target VM, address: '127.0.0.1:46741', transport: 'socket'
13:01:46.257 [main] INFO  edu.webdev.CoursesClientRequest - Starting the test client
Class Path is /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/icedtea-sound.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/management-agent.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/rt.jar:/home/algotrader/coursesclient3/target/classes:/home/algotrader/coursesclient3/lib/clojure-1.8.0.jar:/home/algotrader/coursesclient3/lib/javax.json.jar:/home/algotrader/coursesclient3/lib/hibernate-validator-cdi-5.0.1.Final.jar:/home/algotrader/coursesclient3/lib/validation-api-1.1.0.Final.jar:/home/algotrader/coursesclient3/lib/hibernate-validator-annotation-processor-5.0.1.Final.jar:/home/algotrader/coursesclient3/lib/hibernate-validator-5.0.1.Final.jar:/home/algotrader/coursesclient3/lib/jboss-logging-3.1.1.GA.jar:/home/algotrader/coursesclient3/lib/classmate-0.8.0.jar:/home/algotrader/coursesclient3/lib/javax.el-api-2.2.4.jar:/home/algotrader/.m2/repository/com/sun/jersey/jersey-client/1.19.3/jersey-client-1.19.3.jar:/home/algotrader/.m2/repository/com/sun/jersey/jersey-core/1.19.3/jersey-core-1.19.3.jar:/home/algotrader/.m2/repository/javax/ws/rs/jsr311-api/1.1.1/jsr311-api-1.1.1.jar:/home/algotrader/.m2/repository/com/sun/jersey/jersey-json/1.18.1/jersey-json-1.18.1.jar:/home/algotrader/.m2/repository/org/codehaus/jettison/jettison/1.1/jettison-1.1.jar:/home/algotrader/.m2/repository/com/sun/xml/bind/jaxb-impl/2.2.3-1/jaxb-impl-2.2.3-1.jar:/home/algotrader/.m2/repository/javax/xml/bind/jaxb-api/2.2.2/jaxb-api-2.2.2.jar:/home/algotrader/.m2/repository/javax/xml/stream/stax-api/1.0-2/stax-api-1.0-2.jar:/home/algotrader/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar:/home/algotrader/.m2/repository/org/codehaus/jackson/jackson-core-asl/1.9.2/jackson-core-asl-1.9.2.jar:/home/algotrader/.m2/repository/org/codehaus/jackson/jackson-mapper-asl/1.9.2/jackson-mapper-asl-1.9.2.jar:/home/algotrader/.m2/repository/org/codehaus/jackson/jackson-jaxrs/1.9.2/jackson-jaxrs-1.9.2.jar:/home/algotrader/.m2/repository/org/codehaus/jackson/jackson-xc/1.9.2/jackson-xc-1.9.2.jar:/home/algotrader/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.7.8/jackson-databind-2.7.8.jar:/home/algotrader/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.7.0/jackson-annotations-2.7.0.jar:/home/algotrader/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.7.8/jackson-core-2.7.8.jar:/home/algotrader/.m2/repository/org/mortbay/jetty/jetty-util/6.1.25/jetty-util-6.1.25.jar:/home/algotrader/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/home/algotrader/.m2/repository/ch/qos/logback/logback-classic/1.0.13/logback-classic-1.0.13.jar:/home/algotrader/.m2/repository/ch/qos/logback/logback-core/1.0.13/logback-core-1.0.13.jar:/home/algotrader/.m2/repository/org/apache/httpcomponents/httpcore/4.0.1/httpcore-4.0.1.jar:/home/algotrader/.m2/repository/org/scala-lang/scala-library/2.12.2/scala-library-2.12.2.jar:/home/algotrader/.m2/repository/org/clojure/clojure/1.8.0/clojure-1.8.0.jar:/home/algotrader/.local/share/JetBrains/Toolbox/apps/IDEA-U/ch-0/171.4249.39/lib/idea_rt.jar
13:01:50.975 [main] INFO  CoursesClientRequest - curl 'http://localhost:3000/courses/area/Cs' -H 'Content-Type: application/json'
curl 'http://localhost:3000/courses/area/Cs' -H 'Content-Type: application/json'
13:01:50.976 [main] DEBUG CoursesClientRequest - arguments: /area/CS com.sun.jersey.api.client.Client@57dc9128
13:01:50.978 [main] DEBUG CoursesClientRequest - webresource: http://localhost:3000/courses/area/CS
13:01:50.980 [main] DEBUG CoursesClientRequest - builder: com.sun.jersey.api.client.WebResource$Builder@36b6964d
Jun 23, 2017 1:01:51 PM com.sun.jersey.api.client.ClientResponse getEntity
SEVERE: A message body reader for Java class java.lang.Class, and Java type class java.lang.Class, and MIME media type application/json; charset=utf-8 was not found
Jun 23, 2017 1:01:51 PM com.sun.jersey.api.client.ClientResponse getEntity
SEVERE: The registered message body readers compatible with the MIME media type are:
*/* ->
  com.sun.jersey.core.impl.provider.entity.FormProvider
  com.sun.jersey.core.impl.provider.entity.StringProvider
  com.sun.jersey.core.impl.provider.entity.ByteArrayProvider
  com.sun.jersey.core.impl.provider.entity.FileProvider
  com.sun.jersey.core.impl.provider.entity.InputStreamProvider
  com.sun.jersey.core.impl.provider.entity.DataSourceProvider
  com.sun.jersey.core.impl.provider.entity.XMLJAXBElementProvider$General
  com.sun.jersey.core.impl.provider.entity.ReaderProvider
  com.sun.jersey.core.impl.provider.entity.DocumentProvider
  com.sun.jersey.core.impl.provider.entity.SourceProvider$StreamSourceReader
  com.sun.jersey.core.impl.provider.entity.SourceProvider$SAXSourceReader
  com.sun.jersey.core.impl.provider.entity.SourceProvider$DOMSourceReader
  com.sun.jersey.core.impl.provider.entity.XMLRootElementProvider$General
  com.sun.jersey.core.impl.provider.entity.XMLListElementProvider$General
  com.sun.jersey.core.impl.provider.entity.XMLRootObjectProvider$General
  com.sun.jersey.core.impl.provider.entity.EntityHolderReader

com.sun.jersey.api.client.ClientHandlerException: A message body reader for Java class java.lang.Class, and Java type class java.lang.Class, and MIME media type application/json; charset=utf-8 was not found
	at com.sun.jersey.api.client.ClientResponse.getEntity(ClientResponse.java:630)
	at com.sun.jersey.api.client.ClientResponse.getEntity(ClientResponse.java:586)
	at com.sun.jersey.api.client.WebResource.handle(WebResource.java:686)
	at com.sun.jersey.api.client.WebResource.access$200(WebResource.java:74)
	at com.sun.jersey.api.client.WebResource$Builder.get(WebResource.java:509)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at clojure.lang.Reflector.invokeMatchingMethod(Reflector.java:93)
	at clojure.lang.Reflector.invokeInstanceMethod(Reflector.java:28)
	at src.edu.webdev.CoursesClientRequest$sendGetRequest.invokeStatic(CoursesClientRequest.clj:31)
	at src.edu.webdev.CoursesClientRequest$sendGetRequest.invoke(CoursesClientRequest.clj:18)
	at src.edu.webdev.CoursesClientRequest$doCoursesClientRequest$fn__13.invoke(CoursesClientRequest.clj:56)
	at src.edu.webdev.CoursesClientRequest$doCoursesClientRequest.invokeStatic(CoursesClientRequest.clj:53)
	at src.edu.webdev.CoursesClientRequest$doCoursesClientRequest.invoke(CoursesClientRequest.clj:47)
	at clojure.lang.Var.invoke(Var.java:379)
	at edu.webdev.CoursesClientRequest.invokeMethod(CoursesClientRequest.java:25)
	at edu.webdev.CoursesClientRequest.main(CoursesClientRequest.java:33)
could not send: A message body reader for Java class java.lang.Class, and Java type class java.lang.Class, and MIME media type application/json; charset=utf-8 was not found
AOK All gets have been executed
Disconnected from the target VM, address: '127.0.0.1:46741', transport: 'socket'

Process finished with exit code 0

**Possibly Relevant Webpages**

[How to use Maven to build Clojure code](http://alexott.net/en/clojure/ClojureMaven.html)

[Introduction to Cursive, the Clojure IDE Built on IntelliJ](http://yusizhang.github.io/blog/2015/10/07/the-clojure-ide-cursive-in-intellij)

[Clojure - convert list into Java array](https://stackoverflow.com/questions/16647261/clojure-convert-list-into-java-array)

[Jersey Exception : SEVERE: A message body reader for Java class](https://stackoverflow.com/questions/8594707/jersey-exception-severe-a-message-body-reader-for-java-class)

[How to register my custom MessageBodyReader in my CLIENT?](https://stackoverflow.com/questions/24197076/how-to-register-my-custom-messagebodyreader-in-my-client)

[Creating Custom JAX-RS MessageBodyReader](http://memorynotfound.com/jax-rs-messagebodyreader/)

[Interface MessageBodyReader<T>](http://docs.oracle.com/javaee/7/api/javax/ws/rs/ext/MessageBodyReader.html)

[JAX-RS Custom Entity Providers (TOTD #193)](https://blogs.oracle.com/arungupta/jax-rs-custom-entity-providers-totd-193)

[JAXB Based JSON support not working with Jersey JAX-RS](https://community.oracle.com/thread/2533163)

[Dropwizard error messages from Jersey](https://stackoverflow.com/questions/26138516/dropwizard-error-messages-from-jersey)

[Missing message body reader in dropwizard 0.7 resource tests](https://stackoverflow.com/questions/23422701/missing-message-body-reader-in-dropwizard-0-7-resource-tests)
