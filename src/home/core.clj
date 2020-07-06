(ns home.core
  (:gen-class)
  (:require [home.config :as config]
            [toucan.db :as db]
            [toucan.models :as models]))

(def db-spec {:dbtype   "postgres"
              :dbname   (config/database-name)
              :user     (config/database-username)
              :password (config/database-password)})

(defn -main
  [& args]
  (db/set-default-db-connection! db-spec)
  (models/set-root-namespace! 'home.models))
