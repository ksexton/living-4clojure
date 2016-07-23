;; Local bindings - Elementary
;; Clojure lets you give local names to values using the special let-form.
;; tags - syntax
;; restricted - 
(ns living-4clojure.w1d2_p035
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (let [x 5] (+ 2 x)))
(= __ (let [x 3, y 10] (- y x)))
(= __ (let [x 21] (let [y 3] (/ x y))))
))
