(ns tutorial.Watchers)
(defn Watchers
    []
    (def x (atom 5))
    (add-watch x :xWatcher
        (fn [key atom old-state new-state]
            (println "name of watcher:" key)
            (println "atom reference:" atom)
            (println "old state:" old-state)
            (println "new state:" new-state)))
    (reset! x 10)
    (remove-watch x :xWatcher)
    (reset! x 15)
)

(Watchers)