(ns levels.level-8
    (:require
      [datomic.client.api :as d]
      [max-datom.connections :refer [db]]))

(def author-id #uuid "35636B79-EE46-4447-8AA7-3F0FB351C45C")

(d/q '[:find (pull ?e [:author/first-name :author/last-name :book/_author])
       :in $ ?author-id
       :where [?e :author/id ?author-id]] db author-id)