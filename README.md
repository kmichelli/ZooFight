# ZooFight
This was a school assignment that I had worked on. It starts by creating a cage which different animals can be added to. The three animals are Tiger, Bengal, and Sheep. 

Once all of the animals are added and the cage is at capacity, a simulation will take place.
The simulation will have a different outcome depending on the animals in the cage. 

1.	Interact for a Tiger follows these rules:
  a.	 If the animal that a Tiger is interacting with is a sheep
    i.	The Tiger will set the sheep's health to 0.
    ii.	The Tiger will add the sheep's old health to its current health.
b.	If the animal that a Tiger is interacting with is another Tiger
i.	The Tiger will growl at the other Tiger.
c.	If the animal that a Tiger is interacting with is a Bengal
i.	The animal with less health will lose 10% of its current health.
2.	Interact for a Bengal follows these rules:
a.	If the animal that a Bengal is interacting with is a sheep
i.	The Bengal will set the sheep's health to 0.
ii.	The Bengal will add the sheep's old health to its current health.
b.	If the animal that a Bengal is interacting with is another Bengal
i.	The Bengal will growl at the other Bengal.
c.	If the animal that a Bengal is interacting with is a Tiger
i.	The animal with less health will lose 10% of its current health. 
3.	Interact for a Sheep follows these rules:
a.	Sheep are pretty docile so they only print out “Baaaaah”, no matter what they interact with.

  
Every Animal interacts with the other Animals except itself, that is: given Animal A, Animal B and Animal C:
  1. Animal A will interact with Animal B and Animal C
  2. Animal B will interact with Animal A and Animal C
  3. Animal C will interact with Animal A and Animal B
Immediately after an interaction, if an Animal's health is below or equal to 0, that Animal will be removed from the Cage.
