(ns tutorial.Namespaces
; option 1 
;    (:require [clojure.string])
; option 2 
     (:require [clojure.string :refer [capitalize]])
; option 3
;    (:require [clojure.string :refer :all])
)

(defn -main
    []
; using option 1
;    (println (clojure.string/capitalize "hello"))
; using option 2 and 3
    (println (capitalize "hello"))
)

(-main)