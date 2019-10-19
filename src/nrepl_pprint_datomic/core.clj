(ns nrepl-pprint-datomic.core
  (:require [datomic.api :as d]))

(comment 
 (do
   (def db-uri "datomic:mem://foo")
   (d/create-database db-uri)
   (def conn§ (d/connect db-uri))
   @(d/transact conn [{:db/doc "Hello world"}])))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
