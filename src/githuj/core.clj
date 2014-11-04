(ns githuj.core
  (:gen-class :main true))

(defn parse-args-index
  [cmd-args]
  (when (>= (count cmd-args) 1)
    {:user (nth cmd-args 0)}))

(defn parse-args-open
  [cmd-args]
  (when (>= (count cmd-args) 1)
    {:repo (nth cmd-args 0)}))

(defn parse-args-new
  [cmd-args]
  (when (>= (count cmd-args) 2)
    {:new-repo-name (nth cmd-args 0)
     :auth {:username (nth cmd-args 1)
            :password (nth cmd-args 2)}}))

(defn parse-args 
  [args-to-parse]
  (let [[cmd & cmd-args] args-to-parse]
    (case (.toUpperCase cmd)
      "INDEX" (parse-args-index cmd-args)
      "OPEN" (parse-args-open cmd-args)
      "NEW" (parse-args-new cmd-args))))

(defn -main
  "The application's main function"
  [& args]
  (def parsed-args (parse-args args))
  (if parsed-args
    (println (str "parsed! " parsed-args))
    (println (str "Required arguments not passed. RTFM"))))


