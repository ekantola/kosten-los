(defproject kosten-los "0.1.0-SNAPSHOT"
  :description "kosten los"
  :url ""
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [lib-noir "0.5.0"]
                 [compojure "1.1.5"]
                 [ring-server "0.2.7"]
                 [clabango "0.5"]
                 [com.taoensso/timbre "1.5.2"]
                 [com.taoensso/tower "1.5.1"]
                 [markdown-clj "0.9.19"]
                 [clj-time "0.5.0"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [com.h2database/h2 "1.3.170"]
                 [korma "0.3.0-RC5"]
                 [clj-pdf "1.0.9"]
                 [log4j
                  "1.2.15"
                  :exclusions
                  [javax.mail/mail
                   javax.jms/jms
                   com.sun.jdmk/jmxtools
                   com.sun.jmx/jmxri]]]
  :plugins [[lein-ring "0.8.3"], [lein-idea "1.0.1"]]
  :ring {:handler kosten-los.handler/war-handler
         :init    kosten-los.handler/init
         :destroy kosten-los.handler/destroy}
  :profiles
  {:production {:ring {:open-browser? false
                       :stacktraces?  false
                       :auto-reload?  false}}
   :dev {:dependencies [[ring-mock "0.1.3"]
                        [ring/ring-devel "1.1.8"]]}}
  :min-lein-version "2.0.0")
