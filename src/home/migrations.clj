(ns home.migrations
  (:require [migratus.core :as migratus])
  (:require [clojure.java.jdbc :as jdbc])
  (:require [home.config :as config]))

(def pg-db {:dbtype     "postgresql"
            :dbname     (config/database-name)
            :host       (config/database-host)
            :user       (config/database-username)
            :password   (config/database-password)
            :ssl        false
            :sslfactory "org.postgresql.ssl.NonValidatingFactory"})

(def connection (jdbc/get-connection pg-db))
(def config {:store         :database
             :migration-dir "migrations/"
             :db            {:connection connection}})

(defn up []
  (migratus/migrate config))

(defn down []
  (migratus/rollback config))

(defn create [title]
  (migratus/create config title))