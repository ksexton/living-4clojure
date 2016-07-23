;; Intro to Sequences - Elementary
;; All Clojure collections support sequencing.  You can operate on sequences with functions like first, second, and last.
;; tags - 
;; restricted - 
(ns living-4clojure.w1d1_p012
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (first '(3 2 1)))
(= __ (second [2 3 4]))
(= __ (last (list 1 2 3)))
))
