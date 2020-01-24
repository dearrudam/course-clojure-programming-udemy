(ns tutorial.Conditionals)

(defn ConditionalIf
  "if conditional"
  [x y]
  (println "\nConditional if: is " x "equals to" y "?")
  (if (= x y)
    (println "Statement for a true case"),
    (println "Statement for a false case")
    ))

(ConditionalIf 5 5)
(ConditionalIf 5 3)

(defn ConditionalIfDo
  "if conditional with multiple statements (if do)"
  [x y]
  (println "\nConditional if with do: is" x "equals to" y "?")
  (if (= x y)
    (do (println "First statement for this true case")
        (println "Second statement for this true case"))
    (do (println "First statement for this false case")
        (println "Second statement for this false case"))
    ))

(ConditionalIfDo 5 5)
(ConditionalIfDo 5 3)

(defn ConditionalNestedIf
  "Nested if conditional"
  [x y]
  (println "\nNested if conditional: is" x "equals to" y "and or" y "less than 2 or " y "equals to 2 ?")
  (if (and (= x y) (or (< y 2) (= y 2)))
    (println "True")
    (println "False")
    ))

(ConditionalNestedIf 3 2)
(ConditionalNestedIf 1 1)


(defn ConditionalCase
  "Case conditional"
  [x]
  (println "\nCase condition:")
  (case x
    1 (println "the given arg is 1")
    "dog" (println "the given arg the \"dog\" word")
    true (println "the given arg is true")
    ))

(ConditionalCase 1)
(ConditionalCase "dog")
(ConditionalCase true)


(defn ConditionalCond
  "Cond condition"
  [amount]
  (println "\nCond condition:")
  (cond
    (<= amount 1000) (println "it's less or equals to 1000")
    (<= amount 10000) (println "it's less or equals to 10000")
    (<= amount 100000) (println "it's less or equals to 100000")
    :else (println "it's out of the world")
    ))

(ConditionalCond 1000)
(ConditionalCond 10000)
(ConditionalCond 100000)
(ConditionalCond 1000000)

