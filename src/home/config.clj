(ns home.config
  (:require [environ.core :refer [env]]))

(defn database-host []
  (env :database-host))

(defn database-name []
  (env :database-name))

(defn database-username []
  (env :database-username))

(defn database-password []
  (env :database-password))
