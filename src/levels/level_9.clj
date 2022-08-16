(ns levels.level-9
    (:require
      [datomic.client.api :as d]
      [max-datom.connections :refer [db]]))

(def author-ids [#uuid "0955EDF7-FF8F-4EC2-AFB2-380E7E5D48D7"
                 #uuid "B7761785-79F9-49FA-97AF-13B4F5C2BCC2"])

(d/q '[:find (pull ?e [:author/first-name :author/last-name])
       :in $ [?author-ids ...]
       :where [?e :author/id ?author-ids]] db author-ids)