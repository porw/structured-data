(ns structured-data)

(defn do-a-thing [x]
  (let [xx (+ x x)]
    (Math/pow xx xx)))

(defn spiff [v]
  (+ (get v 0) (get v 2)))

(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [v]
  (let [[x y z] v] (+ x z)))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [[[x y] [z k]] rectangle] (- z x)))

(defn height [rectangle]
  (let [[[z y] [z k]] rectangle] (- k y)))

(defn square? [rectangle]
  (let [[[x y] [z k]] rectangle]
    (if (== (- x z) (- y k))
      true
      false
      )))

(defn area [rectangle]
  (let [[[x y] [z k]] rectangle]
    (* (- x z) (- y k))
    ))
  

(defn contains-point? [rectangle point]
  (let [[[x y] [z k]] rectangle]
    (let [[l m] point]
      (and (cond
             (< x l z) true
             (== x l) true
             (== l z) true
             :else false
             )
           (cond
             (< y m k) true
             (== y m) true
             (== k m) true
             :else false
             )
           ))))

(defn contains-rectangle? [outer inner]
  (let [[[x1 y1] [x2 y2]] outer]
    (let [[[x3 y3] [x4 y4]] inner]
      (and (cond
             (< x1 x3 x2) true
             (== x1 x3) true
             (== x2 x3) true
             :else false
             )
           (cond
             (< y1 y3 y2) true
             (== y1 y3) true
             (== y2 y3) true
             :else false
             )
           (cond
             (< x1 x4 x2) true
             (== x1 x4) true
             (== x2 x4) true
             :else false
             )
           (cond
             (< x1 y4 x2) true
             (== x1 y4) true
             (== x2 y4) true
             :else false
             )
           )
      )))
(defn title-length [book]
  :-)

(defn author-count [book]
  :-)

(defn multiple-authors? [book]
  :-)

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
