(defproject geomesa-quickstart-kafka "0.1.0-SNAPSHOT"
  :description "geomesa-quickstart-kafka tutorial Java->Clojure rewrite"
  :url "https://github.com/trinityXmontoya/geomesa-quickstart-kafka.git"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"
            :year 2016}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.locationtech.geomesa/geomesa-kafka-datastore "1.2.5"]]
  :main ^:skip-aot geomesa-quickstart-kafka.quick-start
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
