;; Get the Caps - Easy
;; Write a function which takes a string and returns a new string containing only the capital letters.
;; tags - strings
;; restricted - 
(ns living-4clojure.w2d1_p029
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ "HeLlO, WoRlD!") "HLOWRD")
(empty? (__ "nothing"))
(= (__ "$#A(*&987Zf") "AZ")
))
