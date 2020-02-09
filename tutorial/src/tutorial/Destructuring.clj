(ns tutorial.Destructuring)
(defn Destruct
  []

  (comment "destructuing a vector")
  (def myVector [1 2 3 4 5])
  (let [[a b c] myVector] (println a b c))
  (let [[a b & rest] myVector] (println a b rest))

  (comment "destructuing a map")
  (def myMap {'name "Max" 'lastname "Arruda"})
  (let [{a 'name b 'lastname} myMap] (println a b))
  (let [{a 'name b 'lastname c 'age} myMap] (println a b c)))

(Destruct)