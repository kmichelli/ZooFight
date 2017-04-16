package school.project;

public class Sheep extends Animal {

	public Sheep(String name, Integer health) {
		super(name, health);
	}

	@Override
	public void interact(Animal a) {
		// TODO Auto-generated method stub
		System.out.println("Baaaah");
	}

}
