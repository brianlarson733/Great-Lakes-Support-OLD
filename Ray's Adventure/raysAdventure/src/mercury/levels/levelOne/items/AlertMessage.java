package mercury.levels.levelOne.items;

import mercury.core.items.BasicItem;

public class AlertMessage extends BasicItem {

	public AlertMessage(String description) {
		super("Alert",description);
		this.stationary=true;
	}

	@Override
	public void use() {
		System.out.println("Thank you for confirming receipt of the message");
		
	}

}
