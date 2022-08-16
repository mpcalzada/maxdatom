(ns levels.level-7
    (:require
      [datomic.client.api :as d]
      [max-datom.connections :refer [db]]))

(d/q '[:find (pull ?e [:author/first-name
                       :author/last-name
                       {:book/author [:book/name :book/publication-date]}])
       :where [?e :author/id #uuid "14E86ACF-000B-463E-90CB-CEA0927A97DA"]] db)