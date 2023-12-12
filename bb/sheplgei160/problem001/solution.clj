(ns sheplgei160.problem001.solution 
  (:require
    [clojure.string :as str]))

(->> (slurp "./qdata/1/files.txt")
     str/split-lines
     (filter #(str/ends-with? % ".exe")))
