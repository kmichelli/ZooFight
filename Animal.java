package school.project;


public abstract class Animal {

	protected String name;
	protected Integer health;
	
	
	
	public Animal(String name, Integer health) {
		super();
		this.name = name;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", health=" + health + "]";
	}
	
	public abstract void interact(Animal a);
	
	
}
