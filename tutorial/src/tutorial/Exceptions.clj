(ns tutorial.Exceptions)

(defn ExceptionHandling
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Caught exception:" (.getMessage e)))
    (catch Exception e (println "Caught a generic exception"))
    (finally (println "cleanup and move on "))
  )
)

(ExceptionHandling "testing")