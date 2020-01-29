  (ns tutorial.StructMaps)

  (defn Pets
    []
    (defstruct pet :PetType :PetName)
    (def myPet (struct pet "dog" "Fido"))
    (println myPet)

    (def myOtherPet (struct-map pet :PetType "cat" :PetName "Fifi"))
    (println myOtherPet)

    (println (:PetType myPet))
    (println (:PetName myOtherPet))

    (def newPet (assoc myPet :PetName "Black"))
    (println newPet)

    (def newOtherPet (assoc myOtherPet :PetAge 10))
    (println newOtherPet)
    )
  (Pets)