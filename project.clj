(defproject reagent-phonecat-tutorial "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.5.1"]
                 [ring/ring-jetty-adapter "1.5.1"]
                 [environ "1.1.0"]
                 ]

  :source-paths ["src/clj" "src/cljs"]
  :main ^:skip-aot reagent-phonecat.server
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})