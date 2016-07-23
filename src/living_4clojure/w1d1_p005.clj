;; Lists: conj - Elementary
;; When operating on a list, the conj function will return a new list with one or more items "added" to the front.
;; tags - 
;; restricted - 
(ns living-4clojure.w1d1_p005
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (conj '(2 3 4) 1))
(= __ (conj '(3 4) 2 1))
))
