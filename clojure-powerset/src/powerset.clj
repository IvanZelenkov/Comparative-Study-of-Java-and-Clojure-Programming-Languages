(ns powerset
  (:use (clojure set test)))

(defn powerset [s]
  (set (reduce (fn [acc v]
                 (concat acc (map #(conj % v) acc))) #{#{}} s)))

(deftest test-powerset
  (is (= #{#{}}
         (powerset #{})))
  (is (= #{ #{} #{1}}
         (powerset #{1})))
  (is (= #{ #{} #{1} #{2} #{1 2}}
         (powerset #{1 2})))
  (is (= #{#{} #{1} #{2} #{1 2} #{3} #{1 3} #{2 3} #{1 2 3}}
         (powerset #{1 2 3}))))