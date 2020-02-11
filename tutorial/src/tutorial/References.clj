(ns tutorial.References)

(defn Refs
    []
    (def amount (ref 1000))
    (println @amount)
    
    (dosync
        (ref-set amount 1010)
        )
    
    (println @amount)
    
    (dosync
        (alter amount inc)
        )
    
    (println @amount)
    
    )

(Refs)