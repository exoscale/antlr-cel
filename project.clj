(defproject com.exoscale/antlr-cel "0.1.1"
  :description "ANTlr4 generated runtime for the CEL grammar"
  :url "https://github.com/exoscale/antlr-cel"
  :license {:name "MIT/ISC"}
  :plugins [[lein-shell "0.5.0"]]
  :dependencies [[org.clojure/clojure      "1.10.3"]
                 [org.antlr/antlr4-runtime "4.9.2"]]
  :prep-tasks [["shell" "sh" "parser/rebuild.sh"] "javac"]
  :omit-source true
  :auto-clean false
  :java-source-paths ["src"]
  :deploy-repositories [["releases" :clojars] ["snapshots" :clojars]]
  :clean-targets ^{:protect false} ["src/exoscale/cel" "target"])
