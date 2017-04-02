(ns reagent-phonecat.server
  (:use
        ring.middleware.params
        ring.util.response
        ring.adapter.jetty
        )
  (:require [environ.core :refer [env]]
  ;          [ring.adapter.jetty :refer [run-jetty]]
            [reagent-phonecat.handler :refer [app]]
  )
  (:gen-class))




(defn -main [& args]
  (let [port (Integer/parseInt (or (env :port) "3000"))]
    (run-jetty app {:port port :join? false})

       ))
