(ns datomic.core-test
  (:require [clojure.test :refer :all]
            [datomic.core :refer :all]))

(deftest a-test
  (nrepl-pprint-datomic "FIXME, I fail."
    (is (= 0 1))))
