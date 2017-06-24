(ns src.edu.webdev.CoursesClientRequest
  (:gen-class
    :name CoursesClientRequest
    :methods [#^{:static true} [doCoursesClientRequest [String] Void]]))

(def applicationServiceURI "http://localhost:3000/courses")

(defn initializeClient
  "Sets up the client HTTP structures."
  []
  (let
    [defaultClientConfig (new com.sun.jersey.api.client.config.DefaultClientConfig)]
    (.. defaultClientConfig
        (getClasses)
        (add (. (new org.codehaus.jackson.jaxrs.JacksonJsonProvider) (getClass))))
    (println (str "Provider list: " (.. defaultClientConfig (getClasses) (toString))))
    (. com.sun.jersey.api.client.Client (create defaultClientConfig))))

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




(defn doCoursesClientRequest
  "Does client initialization, then executes http requests"
  [x gtls]
  (let [client (initializeClient)
        logger (. org.slf4j.LoggerFactory
                  (getLogger (. (new CoursesClientRequest) (getClass))))]
    (try
      (. logger (info "curl 'http://localhost:3000/courses/area/Cs' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/area/Cs' -H 'Content-Type: application/json'")
      (sendGetRequest "/area/CS" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/area/Ac' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/area/Ac' -H 'Content-Type: application/json'")
      (sendGetRequest "/area/Ac" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/area/AD' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/area/AD' -H 'Content-Type: application/json'")
      (sendGetRequest "/area/AD" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/area/*' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/area/*' -H 'Content-Type: application/json'")
      (sendGetRequest "/area/*" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/area/C' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/area/C' -H 'Content-Type: application/json'")
      (sendGetRequest "/area/C" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/instructor/Barbara' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/instructor/Barbara' -H 'Content-Type: application/json'")
      (sendGetRequest "/instructor/Barbara" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/instructor/Da' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/instructor/Da' -H 'Content-Type: application/json'")
      (sendGetRequest "/instructor/Da" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/instructor/ixzy' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/instructor/ixzy' -H 'Content-Type: application/json'")
      (sendGetRequest "/instructor/ixzya" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/instructor/*' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/instructor/*' -H 'Content-Type: application/json'")
      (sendGetRequest "/instructor/*" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/instructor/z' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/instructor/z' -H 'Content-Type: application/json'")
      (sendGetRequest "/instructor/z" client logger gtls)

      (. logger (info "curl 'http://localhost:3000/courses/instructor/q' -H 'Content-Type: application/json'"))
      (println "curl 'http://localhost:3000/courses/instructor/q' -H 'Content-Type: application/json'")
      (sendGetRequest "/instructor/q" client logger gtls)

      (catch Exception e (. e (printStackTrace)) (println (str "something went wrong: " (.getMessage e)))))
    (println x "All gets have been attempted.")))

(defn -doCoursesClientRequest
  "A Java-callable wrapper around the 'doCoursesClientRequest' function."
  [x gtls]
  (doCoursesClientRequest x gtls))
