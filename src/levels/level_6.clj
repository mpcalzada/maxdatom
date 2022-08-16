(ns levels.level-6
  (:require
    [datomic.client.api :as d]
    [max-datom.connections :refer [db]]))

(d/q '[:find (pull ?e [:author/first-name :author/last-name])
       :where [?e :author/id #uuid "14E86ACF-000B-463E-90CB-CEA0927A97DA"]] db)