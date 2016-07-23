;; Prime Numbers - Medium
;; Write a function which returns the first x
;;number of prime numbers.
;; tags - primes
;; restricted - 
(ns living-4clojure.w3d4_p067
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ 2) [2 3])
(= (__ 5) [2 3 5 7 11])
(= (last (__ 100)) 541)
))
