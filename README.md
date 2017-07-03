# coursesclient3

Some more relevant info about the Clojure environment is found in ClojureDiscussion.pdf, in which some questions were answered on the [Cursive Mailing List](https://groups.google.com/forum/#!forum/cursive) about mixed language Clojure programming and the use of the Intellij Cursive plugin.

Two other mailing lists useful for Clojure programming are [Clojure](https://groups.google.com/forum/#!forum/clojure) and [Clojure Dev](https://groups.google.com/forum/#!forum/clojure-dev)


**Possibly Relevant Webpages**

_Why Clojure_

[Why Clojure over other JVM Lisps: Kawa, Armed Bear or SISC?](https://stackoverflow.com/questions/1413390/why-clojure-over-other-jvm-lisps-kawa-armed-bear-or-sisc)

_Other JVM LISP Implementations_

[The Kawa Scheme Language](https://www.gnu.org/software/kawa/)

_Clojure Overview_

[Clojure: Lisp meets Java, with a side of Erlang](http://radar.oreilly.com/2011/06/clojure-java-lisp-jvm.html)

[Clojure Programming Language](https://clojure.org/)

[Differences with other Lisps](https://clojure.org/reference/lisps)

[Clojure 1.8 Cheat Sheet (v38)](https://clojure.org/api/cheatsheet)

[Downloadable Clojure reference manual](https://stackoverflow.com/questions/6981622/downloadable-clojure-reference-manual)


_Clojure with Maven_

[How to use Maven to build Clojure code](http://alexott.net/en/clojure/ClojureMaven.html)

[Why using Maven for Clojure builds is a no-brainer](https://cemerick.com/2010/03/25/why-using-maven-for-clojure-builds-is-a-no-brainer/)

[talios/clojure-maven-plugin](https://github.com/talios/clojure-maven-plugin)

_IDE and Tools_

I found two Intellij plugins: Cursive and Closure-Kit. Neither seems to work correctly with the current version of intellij.
 
Thus I cannot consider this problem to be a true assignment. It is better just to take a look at the pom.xml, CoursesClientRequest.java, and CoursesClientRequest.clj to see what I did to get Java and Closure to interoperate.

I will spend sometime later to get these plugins to work properly. (Maybe someone has already done the work, and I just did not find the correct plugins by googling.)

Getting these plugins to work is important because there is probably a great deal of usefulness in Clojure for NLP, medical software engineering, financial software engineering, and legal software engineering.

I chose the Cursive plugin, which worked better than Closure-Kt.

Then I created the Clojure module and from there I created the src.edu.webdev.CoursesClientRequest.clj namespace.

The (ns) sexpr maps the Clojure namespace to a Java class.

It seems to be necessary to mark Intellij (test) sources root manually.

Breakpoints currently don't seem to work properly.

The builtin editor seems to misbehave. I edited with emacs and let Intellij automatically discover modifications of .clj files.

Because I am creating executable JARs, it was important to make sure the run/debug configuration specified JAR application.

Intellij seems to have been slow in discovering changes to Clojure modules.

I tended to use maven lifecyle clean and build Clojure modules manually (there was only one) and then invoke maven lifecyle install.

The red error indicator appears in the upper right corner of the s.e.w.CourseClientRequest window because the Clojure parser seems unable to distinguish between a Java method named get and the Clojure/core get function. This error indicator does not prevent compilation.

[Introduction to Cursive, the Clojure IDE Built on IntelliJ](http://yusizhang.github.io/blog/2015/10/07/the-clojure-ide-cursive-in-intellij)

_Java (and probably Scala) Clojure Interoperability_

[Clojure - convert list into Java array](https://stackoverflow.com/questions/16647261/clojure-convert-list-into-java-array)

_JSON-Jersey in Clojure (and Otherwise)_

[Jersey Exception : SEVERE: A message body reader for Java class](https://stackoverflow.com/questions/8594707/jersey-exception-severe-a-message-body-reader-for-java-class)

[How to register my custom MessageBodyReader in my CLIENT?](https://stackoverflow.com/questions/24197076/how-to-register-my-custom-messagebodyreader-in-my-client)

[Creating Custom JAX-RS MessageBodyReader](http://memorynotfound.com/jax-rs-messagebodyreader/)

[Interface MessageBodyReader<T>](http://docs.oracle.com/javaee/7/api/javax/ws/rs/ext/MessageBodyReader.html)

[JAX-RS Custom Entity Providers (TOTD #193)](https://blogs.oracle.com/arungupta/jax-rs-custom-entity-providers-totd-193)

[JAXB Based JSON support not working with Jersey JAX-RS](https://community.oracle.com/thread/2533163)

[Dropwizard error messages from Jersey](https://stackoverflow.com/questions/26138516/dropwizard-error-messages-from-jersey)

[Missing message body reader in dropwizard 0.7 resource tests](https://stackoverflow.com/questions/23422701/missing-message-body-reader-in-dropwizard-0-7-resource-tests)

[How to Create RESTful Java Client With Jersey Client – Example](https://crunchify.com/how-to-create-restful-java-client-with-jersey-client-example/)

[How to build RESTful Service with Java using JAX-RS and Jersey (Example)](https://crunchify.com/how-to-build-restful-service-with-java-using-jax-rs-and-jersey/)


**Specific Issues**

_Getting the class in Clojure._

Clojure does not have the equivalent of Java ".class", but the class function (comparable to Scala classOf) can be applied to a Java object.

_Clojure versus GenericType_

There is nothing like the following in Clojure.
````
    new GenericType<List<String>>() {}
````
Thus I had to pass the above as a Java object to the Clojure functions.
````
    public void invokeMethod() {
        // clojure.core ns is read by default -- get require
        // then read edu.webdev.clojure.CoursesClientRequest
        IFn require = Clojure.var( "clojure.core", "require" );
        require.invoke( Clojure.read( "src.edu.webdev.CoursesClientRequest" ) );
        // Invoke foo method in src.edu.webdev.edu.CoursesClientRequest.clj
        IFn foo = Clojure.var( "src.edu.webdev.CoursesClientRequest", "doCoursesClientRequest" );
        foo.invoke( "AOK", new GenericType<List<String>>() {} );
    }
````
I'm not sure the namespace definition (ns) code is exactly correct, but the program seems to work.
````
(ns src.edu.webdev.CoursesClientRequest
  (:gen-class
    :name CoursesClientRequest
    :methods [#^{:static true} [doCoursesClientRequest [String] Void]]))
````
Note that the accept method below takes a variable number of arguments.

Checkout how I pass the argument to it in the following function definition.
````
(defn sendGetRequest
  [s me log gtls]
  (if (not (nil? s))
    (do
      (. log (debug "arguments: {} {}" s (. me (toString))))
      (. log (debug "webresource: {}" (.. me
                                          (resource (str applicationServiceURI s))
                                          (toString))))
      (. log (debug "builder: {}" (.. (. me (resource (str applicationServiceURI s)))
                                      (accept (into-array (list "application/json")))
                                      (toString))))
      (try
        (let [webResource (. me (resource (str applicationServiceURI s)))
              response (.. webResource
                           (accept (into-array (list "application/json")))
                           (get com.sun.jersey.api.client.ClientResponse))]
          (if (not (== (. response (getStatus)) 200))
            (throw (new RuntimeException
                        (str "Failed : HTTP error code : "
                             (. response (getStatus))))))
          ; note post-fix . instead of new
          (println (into [] (java.util.ArrayList.
                              (. response (getEntity gtls))))))
        (catch Exception e (. e (printStackTrace)) (println (str "could not send: " (.getMessage e))))))
    (throw (new RuntimeException "Bad URI"))))
````
The various Java JSON reading and decoding libraries depend on constructs like GenericType above. It really does not fit very well with culture. It might be worthwhile to create a pure Clojure library to implement JAX-RS and Jersey clients without invoking methods from Java JARs.  

_Java Clojure Interoperability_

[Java Interop](https://clojure.org/reference/java_interop)

[Converting between clojure data structures and java collections](https://www.niwi.nz/2013/10/13/converting-between-clojure-data-structures-and-java-collections/)

[Converting Clojure data structures to Java collections](https://stackoverflow.com/questions/4313505/converting-clojure-data-structures-to-java-collections)

[into list vs. into vector in Clojure](https://stackoverflow.com/questions/32936052/into-list-vs-into-vector-in-clojure)

[How to pass a typed collection from clojure to java?](https://stackoverflow.com/questions/3688730/how-to-pass-a-typed-collection-from-clojure-to-java)

[into-array](https://clojuredocs.org/clojure.core/into-array)

[to-array](https://clojuredocs.org/clojure.core/to-array)

[Clojure - convert list into Java array](https://stackoverflow.com/questions/16647261/clojure-convert-list-into-java-array)



