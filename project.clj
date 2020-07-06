(defproject home "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 ; api deps
                 [prismatic/schema "1.1.12"]
                 [metosin/compojure-api "2.0.0-alpha31"]
                 [ring/ring-jetty-adapter "1.8.1"]
                 ; db deps
                 [toucan "1.15.1"]
                 [org.postgresql/postgresql "42.2.14"]
                 [org.clojure/java.jdbc "0.7.11"]
                 [migratus "1.2.8"]
                 ; utils
                 [environ "1.2.0"]
                 [com.taoensso/timbre "4.10.0"]
                 [com.fzakaria/slf4j-timbre "0.3.19"]]
  :plugins [[lein-cljfmt "0.6.8"]]
  :main ^:skip-aot home.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :aliases {"migrate-up" ["run" "-m" "home.migrations/up"]
            "migrate-down" ["run" "-m" "home.migrations/down"]
            "migrate-create" ["run" "-m" "home.migrations/create"]})
