(defproject com.brunobonacci/machina "0.1.0-SNAPSHOT"
  :description "FIXME: write description"

  :url "https://github.com/BrunoBonacci/machina"

  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :scm {:name "git" :url "https://github.com/BrunoBonacci/machina.git"}

  :dependencies [[org.clojure/clojure "1.10.0-RC4"]
                 [com.brunobonacci/safely "0.5.0-alpha5"]
                 [org.clojure/tools.logging "0.4.1"]]

  :global-vars {*warn-on-reflection* true}

  :jvm-opts ["-server"]

  :profiles {:dev {:dependencies [[midje "1.9.4"]
                                  [org.clojure/test.check "0.10.0-alpha3"]
                                  [criterium "0.4.4"]
                                  [org.slf4j/slf4j-log4j12 "1.8.0-beta2"]]
                   :resource-paths ["dev-resources"]
                   :plugins      [[lein-midje "3.2.1"]]}}
  )
