(ns tutorial.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is Max")
  (println "Loving Clojure so far")
  (+ 2 5))

#(println "Hello" %)

(def increment (fn [x] (+ x 1)))

(defn increment_set
  [x]
  (map increment x))

(defn DataTypes []
  (def a 1)
  (def b 1.22)
  (def c 1.25e-12)
  (def d 0xfb)
  (def e nil)
  (def f true)
  (def g "hello")
  (def h 'thanks)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println h)
  )
(DataTypes)
