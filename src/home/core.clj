(ns home.core
  (:gen-class)
  (:require [home.config :as config]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (config/database-host)))
