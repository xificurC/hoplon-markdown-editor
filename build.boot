(set-env!
 :source-paths #{"src"}
 :dependencies '[[adzerk/boot-cljs "1.7.48-3" :scope "test"]
                 [adzerk/boot-cljs-repl "0.1.10-SNAPSHOT" :scope "test"]
                 [adzerk/boot-reload "0.3.2" :scope "test"]
                 [org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]
                 [hoplon/hoplon "6.0.0-alpha9"]
                 [hoplon/boot-hoplon "0.1.7"]
                 [cljsjs/showdown "0.4.0-1"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]]
         '[adzerk.boot-reload :refer [reload]]
         '[hoplon.boot-hoplon :refer [hoplon]])

(deftask dev []
  (comp (watch)
        (speak)
        (hoplon)
        (cljs-repl)
        (reload)
        (cljs)))
