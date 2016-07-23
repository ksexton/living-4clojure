;; Vectors: conj - Elementary
;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
;; tags - 
;; restricted - 
(ns living-4clojure.w1d1_p007
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (conj [1 2 3] 4))
(= __ (conj [1 2] 3 4))
))
