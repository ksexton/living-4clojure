;; Let it Be - Elementary
;; Can you bind x, y, and z so that these are all true?
;; tags - math:syntax
;; restricted - 
(ns living-4clojure.w1d2_p036
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 10 (let __ (+ x y)))
(= 4 (let __ (+ y z)))
(= 1 (let __ z))
))
