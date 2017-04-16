package school.project;

import school.project.CageException;
import school.project.Animal;

public class Cage <T extends Animal> {
	
	int capacity;
	@SuppressWarnings("unchecked")
	T[] arrayOfAnimals=((T[]) new Animal[10]);
	int size;
	
	@SuppressWarnings("unchecked")
	public Cage(int capacity) throws CageException {
		if (capacity > 0) {
		arrayOfAnimals = ((T[]) new Animal[capacity]);
		size = 0;
		this.capacity = capacity;
		}
		else {
			throw new CageException("Cage size must be greater than 0");
		}
	}
	
	public Animal[] getOccupants() {
		return arrayOfAnimals;
	}
	
	public int getCapacity() {
		return arrayOfAnimals.length;
	}

	public void add(T animal) throws CageException {
		for (int i = 0; i < size; i++) {
	    	if (animal.name.equals(arrayOfAnimals[i].name))
	    		throw new CageException("That name already exist");
		}
			if (size >= capacity)
		    	throw new CageException("Adding new animal will exceed cage capacity");
			else {
				arrayOfAnimals[size] = animal;
				size++;
			}	
	}

	public void remove(String animalName) throws CageException {
		for (int i = 0; i < arrayOfAnimals.length; i++) {
			if (arrayOfAnimals[i] != null)
				if (animalName.equals(arrayOfAnimals[i].name))
						arrayOfAnimals[i] = null;
				else
					throw new CageException("That animal does not exist in cage");	
			else
				throw new CageException("Empty. That animal does not exist in cage");
		}
	}

	public void simulate() {
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				if (i != j) {
					arrayOfAnimals[i].interact(arrayOfAnimals[j]);
				}
		for (int i = 0; i < size; i++)
			if (arrayOfAnimals[i].health == 0)
				arrayOfAnimals[i].equals(null); 								
	}
	
}
