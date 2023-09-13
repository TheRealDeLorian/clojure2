(ns graphics
  (:require [clojure.test :refer :all])
  (:require [quil.core :as q]))

(defn setup []
  (q/frame-rate 100)                    
  (q/background 200))                
                                      
(defn draw []
  (let [x 0
        y 0]
    (q/rect x y 10 10)))

(defn update [state]
  (update-in state [:r] inc))


(defn draw-stuff [opts]
  (q/defsketch example                 ;; Define a new sketch named example
    :title "Game of Life"    ;; Set the title of the sketch
    :setup setup                        ;; Specify the setup fn
    :draw draw   
    :update update
    :size [1000 1000]))                   ;; You struggle to beat the golden ratio
  



 ;   (q/stroke (q/random 255))             ;; Set the stroke colour to a random grey
  ; (q/stroke-weight (q/random 10))       ;; Set the stroke thickness randomly
   ;(q/fill (q/random 255))               ;; Set the fill colour to a random grey
  
  ; (let [diam (q/random 100)             ;; Set the diameter to a value between 0 and 100
   ;      x    (q/random (q/width))       ;; Set the x coord randomly within the sketch
    ;     y    (q/random (q/height))]     ;; Set the y coord randomly within the sketch
    ; (q/rect x y x y)))         ;; Draw a circle at x y with the correct diameter