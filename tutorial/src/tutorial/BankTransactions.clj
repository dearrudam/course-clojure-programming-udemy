(ns tutorial.BankTransactions)

(def buyerAccount (ref 100))
(def merchantAccount (ref 0))
(def prices {'pen 1, 'notebook 5, 'backpack 100})
(def items (ref []))

(defn printInfo
    []
    (println "\ninfo:")
    (println "buyerAccount:" @buyerAccount)
    (println "merchantAccount:" @merchantAccount)
    (println "items:" @items)
    )

(defn buy 
    [item]
    (def itemPrice (get prices item))
    (if (<= itemPrice @buyerAccount)
        (dosync
            (ref-set buyerAccount (- @buyerAccount itemPrice))
            (ref-set merchantAccount (+ @merchantAccount itemPrice))
            (def newItems (cons item @items))
            (ref-set items newItems)
            )
        (println "Insufficient funds")
        )
    (printInfo)
    )


(buy 'pen)

(buy 'notebook)

(buy 'backpack)