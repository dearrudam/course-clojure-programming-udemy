(ns tutorial.petstore)

(defn petToHumanAge
  "This function returns the pet's age in humans years"
  [x]
  (def petStore {'dog 7, 'goldfish 10, 'cat 5})
  (get petStore x))

(defn age
  "This function returns the age of the pet in human years for a given pet age"
  [petName petType petAge]
  (def factor (petToHumanAge petType))
  (println petName "is" (* factor petAge) "years old in human years!"))

(age "Black" 'dog 7)
(age "Xani" 'cat 3)
(age "Uti" 'goldfish 1)