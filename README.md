# ZooFight
This was a school assignment that I had worked on. It starts by creating a cage which different animals can be added to. The three animals are Tiger, Bengal, and Sheep. 

Once all of the animals are added and the cage is at capacity, a simulation will take place.
The simulation will have a different outcome depending on the animals in the cage. 
Interact for a Tiger follows these rules:
  •	If the animal that a Tiger is interacting with is a sheep
    - The Tiger will set the sheep's health to 0.
    - The Tiger will add the sheep's old health to its current health.
  •	If the animal that a Tiger is interacting with is another Tiger
    - The Tiger will growl at the other Tiger.
  •	If the animal that a Tiger is interacting with is a Bengal
    - The animal with less health will lose 10% of its current health.
Interact for a Bengal follows these rules:
  •	If the animal that a Bengal is interacting with is a sheep
    - The Bengal will set the sheep's health to 0.
    - The Bengal will add the sheep's old health to its current health.
  •	If the animal that a Bengal is interacting with is another Bengal
    - The Bengal will growl at the other Bengal.
  •	If the animal that a Bengal is interacting with is a Tiger
    - The animal with less health will lose 10% of its current health. 
Interact for a Sheep follows these rules:
  -Sheep are pretty docile so they only print out “Baaaaah”, no matter what they interact with.
  
Every Animal interacts with the other Animals except itself, that is: given Animal A, Animal B and Animal C:
  1. Animal A will interact with Animal B and Animal C
  2. Animal B will interact with Animal A and Animal C
  3. Animal C will interact with Animal A and Animal B
Immediately after an interaction, if an Animal's health is below or equal to 0, that Animal will be removed from the Cage.
