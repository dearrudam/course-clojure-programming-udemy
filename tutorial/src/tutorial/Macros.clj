(ns tutorial.Macros)

(macroexpand-1 '(when true (println "it's a macro")))