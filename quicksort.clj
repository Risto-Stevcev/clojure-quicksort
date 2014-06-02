(use 'clojure.java.io)

(defn quicksort [array]
 (if (empty? array) array
   (let [pivot (first array)]
     (let [lower (quicksort (filter (fn [x] (< x pivot)) (rest array)))
           higher (quicksort (filter (fn [x] (>= x pivot)) (rest array)))]
       (concat lower (list pivot) higher)))))

(defn parse-int [s]
   (Integer. (re-find  #"\d+" s )))

(defn get-lines [fname]
  (with-open [r (reader fname)]
    (doall (map parse-int (line-seq r)))))

(let [list (get-lines "IntArray.txt")]
 (print (quicksort list)))
