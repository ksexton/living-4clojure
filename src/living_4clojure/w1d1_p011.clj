;; Maps: conj - Elementary
;; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".
;; tags - 
;; restricted - 
(ns living-4clojure.w1d1_p011
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
))
