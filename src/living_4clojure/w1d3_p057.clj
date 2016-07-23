;; Simple Recursion - Elementary
;; A recursive function is a function which calls itself.  This is one of the fundamental techniques used in functional programming.
;; tags - recursion
;; restricted - 
(ns living-4clojure.w1d3_p057
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))
))
