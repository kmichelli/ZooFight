package school.project;
 
import org.junit.Test;

import org.junit.Assert;


public class CageTest {
	
	@Test (expected = CageException.class)
	public void testCreateCageEx() throws CageException {
		Cage<Animal> c = new Cage<Animal>(0);
	}
	
	@Test
	public void testGetCapacity() throws CageException {
		Cage<Animal> c = new Cage<Animal>(5);
	    System.out.print(c.getCapacity());
	}
	
	@Test
	public void testAddToTigerCage() throws CageException {
		Bengal bengal = new Bengal("bengal", 20);
		Cage<Tiger> tigerCage = new Cage<Tiger>(5);
		tigerCage.add(bengal);
		Animal[] array = tigerCage.getOccupants();
	    System.out.println("Animals in cage: ");      
	      for (int i = 0; i < array.length; i++)
	         System.out.println( array[i]);	
	}
	
	@Test 
	public void testAddToAnimalCage() throws CageException {
		Sheep sheep = new Sheep("sheep", 15);
		Bengal bengal = new Bengal("bengal", 25);
		Cage<Animal> c = new Cage<Animal>(5);
		c.add(bengal);
		c.add(sheep);
		Animal[] array = c.getOccupants();
	    System.out.println("Animals in cage: ");      
	      for (int i = 0; i < array.length; i++)
	         System.out.println( array[i]);	
	}
	
	@Test (expected = CageException.class)
	public void testRemoveAnimalEx() throws CageException {
		Cage<Animal> c = new Cage<Animal>(5);
		c.remove("bengal");
	}
	
	@Test (expected = CageException.class)
	public void testAddAnimalEx() throws CageException {
		Bengal bengal = new Bengal("bengal", 20);
		Bengal bengal2 = new Bengal("bengal", 20);
		Cage<Animal> c = new Cage<Animal>(5);
		c.add(bengal);
		c.add(bengal2);	
	}
	
	@Test
	public void testSimulate() throws CageException {
		Tiger tiger = new Tiger("tiger", 10);
		Bengal bengal = new Bengal("bengal", 5);
		Sheep sheep = new Sheep("sheep", 20);
		Cage<Animal> cage = new Cage<Animal>(5);
		cage.add(tiger);
		cage.add(bengal);
		cage.add(sheep);
		cage.simulate();
		
		Assert.assertEquals((Integer)30, (Integer)tiger.getHealth());
		Assert.assertEquals((Integer)3, (Integer)bengal.getHealth());
		Assert.assertEquals((Integer)0, (Integer)sheep.getHealth());
		
	}
}
