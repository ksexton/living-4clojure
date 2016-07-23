;; Intro to Iterate - Easy
;; The iterate function can be used to produce an infinite lazy sequence.
;; tags - seqs
;; restricted - 
(ns living-4clojure.w1d5_p045
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (take 5 (iterate #(+ 3 %) 1)))
))
