(defproject codenoise "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.namespace "0.1.0"]
                 [overtone "0.7.1"]
                 [org.clojure/math.numeric-tower "0.0.1"]]
  :profiles { :dev { :plugins [[lein-metrics "1.0.0-SNAPSHOT"]]}})
