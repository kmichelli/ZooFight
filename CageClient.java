package school.project;

import java.util.Scanner;

public class CageClient {
	

	public static void main(String [] args) throws CageException{		
		Scanner in = new Scanner(System.in);
		Cage<Animal> cage;
		
		int capacity = 0;
		int intialHealth;
		
		String name;
		String typeOfAnimal;
		String cont = null;
		
		System.out.println("Enter the size of your cage: ");	
		capacity = Integer.parseInt(in.nextLine());
		try {
			cage = new Cage<Animal>(capacity);
		} catch (CageException e) { 
			System.out.println("Must be greater than 0. Enter the size of your cage: ");	
			capacity = Integer.parseInt(in.nextLine());
			cage = new Cage<Animal>(capacity);
		} 
		do {
			System.out.println("Enter the type of animal: ");
			in = new Scanner(System.in);
			typeOfAnimal = in.nextLine();
			System.out.println("Enter the name of the " + typeOfAnimal + ": ");
			name = in.nextLine();
			System.out.println("Enter the intial health of " + name + ": ");
			intialHealth = Integer.parseInt(in.nextLine());
			try {
				Animal animal = null;
				if (typeOfAnimal.equals("Bengal") || typeOfAnimal.equals("bengal"))
					animal = new Bengal(name, intialHealth);
				else if (typeOfAnimal.equals("Sheep") || typeOfAnimal.equals("sheep"))
					animal = new Sheep(name, intialHealth);
				else if (typeOfAnimal.equals("Tiger") || typeOfAnimal.equals("tiger"))
					animal = new Tiger(name, intialHealth);
				else {
					System.out.print("That was not a valid type. Must be a Bengal, Tiger or Sheep");
					System.out.println("Enter the type of animal: ");
					typeOfAnimal = in.nextLine();
					if (typeOfAnimal.equals("Bengal") || typeOfAnimal.equals("bengal"))
						animal = new Bengal(name, intialHealth);
					else if (typeOfAnimal.equals("Sheep") || typeOfAnimal.equals("sheep"))
						animal = new Sheep(name, intialHealth);
					else if (typeOfAnimal.equals("Tiger") || typeOfAnimal.equals("tiger"))
						animal = new Tiger(name, intialHealth);
				}
				cage.add(animal);
				System.out.println("Do you want to add another animal? (Y/N)");
				cont = in.nextLine();
			} catch (CageException e) {
				System.out.println("The cage is full or the animal was a duplicate");
				System.out.println("Please enter the information again..");
				System.out.println("Are you sure you want to add another animal? (Y/N)");
				cont = in.nextLine();
			}
		}	while (cont.equals("y") || cont.equals("Y"));
		System.out.print("Now simulating...");
		System.out.println();
		cage.simulate();
		Animal[] array = cage.getOccupants();
		for (int i = 0; i < array.length; i++)
			System.out.println( array[i]);	
	}
}
