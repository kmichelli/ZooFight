package school.project;

public class Tiger extends Animal {
	
	public Tiger(String name, Integer health) {
		super(name, health);
	}

	@Override
	public void interact(Animal a) {
		if (a instanceof Sheep) {
			this.health += a.health;
			a.setHealth(0);
		};
		
		if (a instanceof Bengal) {
			if (a.health > this.health) {
				this.health = (int) (this.health - this.health * .1);
			}
			else {
				a.health = (int) (a.health - a.health * .1);
			}
		};
		
		if (a instanceof Tiger) {
			growl();
		};
	}
	
	public void growl() {		
		System.out.println("Prrrr");
	}
	
	
}
