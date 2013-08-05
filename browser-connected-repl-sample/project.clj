(defproject com.cemerick/austin-repl-sample ""
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1847"]
                 [ring "1.2.0"]
                 [compojure "1.1.5"]
                 [enlive "1.1.1"]]

  :profiles {:dev {:repl-options {:init-ns cemerick.austin.bcrepl-sample}
                   :plugins [[com.cemerick/austin "0.1.0-SNAPSHOT"]
                             [lein-cljsbuild "0.3.2"]]
                   :cljsbuild {:builds [{:source-paths ["src/cljs"]
                                         :compiler {:output-to "target/classes/public/app.js"
                                                    :optimizations :simple
                                                    :pretty-print true}}]}}})
