(ns tutorial.Agents)

(defn Agents
    []
    (def amount (agent 500))
    (println @amount)

    (send amount inc)
    (println @amount)
    (println "Some time must pass")
    (println @amount)

    (send amount inc)
    (await-for 1000 amount)
    (println @amount)

    (comment "Our program it's not complex then no agent-error is generated")
    (println (agent-error amount))

    )

(Agents)