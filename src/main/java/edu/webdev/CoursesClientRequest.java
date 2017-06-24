package edu.webdev;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

//import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by algotrader on 6/21/17.
 */
public class CoursesClientRequest {
    private static final Logger logger = LoggerFactory.getLogger( CoursesClientRequest.class );
    //static Client client = null;
    final static String applicationServiceURI = "http://localhost:3000/courses"; // should be configurable

    public void invokeMethod() {
        // clojure.core ns is read by default -- get require
        // then read edu.webdev.clojure.CoursesClientRequest
        IFn require = Clojure.var( "clojure.core", "require" );
        require.invoke( Clojure.read( "src.edu.webdev.CoursesClientRequest" ) );
        // Invoke foo method in src.edu.webdev.edu.CoursesClientRequest.clj
        IFn foo = Clojure.var( "src.edu.webdev.CoursesClientRequest", "doCoursesClientRequest" );
        foo.invoke( "AOK", new GenericType<List<String>>() {} );
    }

    public static void main(String[] args) {
        logger.info( "Starting the test client" );
        System.out.println( "Class Path is " + System.getProperty( "java.class.path" ) );

        CoursesClientRequest coursesclient = new CoursesClientRequest();
        coursesclient.invokeMethod();
    }

}
