package mercury.core.items;

public abstract class Weapon extends BasicItem {

	int damagePoints;
	
	public Weapon(String name, String description, int damagePoints) {
		super(name, description);
		this.damagePoints= damagePoints;
		
	}

}
