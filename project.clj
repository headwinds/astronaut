(defproject clojure-getting-started "1.0.0-SNAPSHOT"
  :description "a simple secure store"
  :url "https://glacial-badlands-20785.herokuapp.com"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.4.0"]
                 [ring/ring-json "0.3.1"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [environ "1.0.0"]
                 [org.clojure/java.jdbc "0.6.1"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "clojure-getting-started-standalone.jar"
  :profiles {:production {:env {:production true}}})
