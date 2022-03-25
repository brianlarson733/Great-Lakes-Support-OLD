package mercury.core.items;

public abstract class HealthItem extends BasicItem {

	int healthPoints;
	
	public HealthItem(String name, String description, int healthPoints) {
		super(name, description);
		this.healthPoints= healthPoints;
		
	}

}
