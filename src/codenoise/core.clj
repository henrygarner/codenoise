(ns codenoise.core
  (:use [clojure.tools.namespace]
        [clojure.java.io :only [file]]
        [overtone.live :as o]))

(defn foo
  "I don't do a whole lot."
  [dirname]
  (let [n (find-namespaces-in-dir (file dirname))]
    (doseq [ns n]
      (require ns)
      (prn (ns-publics ns))
      (prn (ns-resolve ns)))))

(defn function-attributes [ns sym]
  (let [attrs (meta (ns-resolve ns sym))
        arglists (:arglists attrs)]
    {:arities (map count arglists) :name (:name attrs)}))

(defn bar
  ([a b c] (prn a b))
  ([a c d g s h]))

(definst beep [frequency 440 duration 1]
  (let [envelope (o/line 1 0 duration :action o/FREE)]
    (* envelope (o/sin-osc frequency))))
