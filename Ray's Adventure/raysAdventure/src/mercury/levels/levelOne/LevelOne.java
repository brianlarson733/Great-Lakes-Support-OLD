package mercury.levels.levelOne;
import mercury.core.beings.Alloy;
import mercury.core.beings.Ray;
import mercury.core.levels.BasicLevel;
import mercury.levels.levelOne.beings.Bug;
import mercury.levels.levelOne.items.*;
import mercury.levels.levelOne.rooms.*;

import java.util.Random;

public class LevelOne extends BasicLevel {

	public LevelOne() {
		super(5313);
	}

	public void startLevel() {
		//create rooms
		MainCorridor mainCorridor = new MainCorridor();
		Cockpit cockpit = new Cockpit();
		MedicalBay medicalBay = new MedicalBay();
		CrewQuarters crewQuarters = new CrewQuarters();
		CrewLounge crewLounge = new CrewLounge();
		CargoBay cargoBay = new CargoBay();
		EngineRoom engineRoom = new EngineRoom();
		StorageArea storageAreaCrewQuarters = new StorageArea("Crew quarters storage area");
		StorageArea storageAreaEngineRoom = new StorageArea("Engine room storage area");
		GarbageRoom garbageRoom = new GarbageRoom();
		
		//connect rooms
		mainCorridor.addDoor(cockpit);
		cockpit.addDoor(mainCorridor);
		
		mainCorridor.addDoor(medicalBay);
		medicalBay.addDoor(mainCorridor);
		
		mainCorridor.addDoor(crewQuarters);
		crewQuarters.addDoor(mainCorridor);
		
		mainCorridor.addDoor(crewLounge);
		crewLounge.addDoor(mainCorridor);
		
		mainCorridor.addDoor(cargoBay);
		cargoBay.addDoor(mainCorridor);
		
		mainCorridor.addDoor(engineRoom);
		engineRoom.addDoor(mainCorridor);
		
		crewQuarters.addDoor(storageAreaCrewQuarters);
		storageAreaCrewQuarters.addDoor(crewQuarters);
		
		engineRoom.addDoor(storageAreaEngineRoom);
		storageAreaEngineRoom.addDoor(engineRoom);

		mainCorridor.addDoor(garbageRoom);
		garbageRoom.addDoor(mainCorridor);
		
		//create beings
		Random rand = new Random();
		Ray ray = new Ray(mainCorridor);
		mainCorridor.addBeing(ray);

		//random starting location for Alloy 

		int randomInt = rand.nextInt(mainCorridor.doors.size());
		Alloy alloy = new Alloy(mainCorridor.getDoor(randomInt), ray);
		ray.alloy= alloy;
		mainCorridor.getDoor(randomInt).addBeing(alloy);


		//random starting location for the bugs
		randomInt = rand.nextInt(mainCorridor.doors.size());
		Bug bugOne = new Bug(mainCorridor.getDoor(randomInt), ray);
		mainCorridor.getDoor(randomInt).addBeing(bugOne);

		randomInt = rand.nextInt(mainCorridor.doors.size());
		Bug bugTwo = new Bug(mainCorridor.getDoor(randomInt), ray);
		mainCorridor.getDoor(randomInt).addBeing(bugTwo);

		randomInt = rand.nextInt(mainCorridor.doors.size());
		Bug bugThree = new Bug(mainCorridor.getDoor(randomInt), ray);
		mainCorridor.getDoor(randomInt).addBeing(bugThree);

		//add items, some with random starting locations
		Map map = new Map();
		mainCorridor.getDoor(rand.nextInt(mainCorridor.doors.size())).addItem(map);
		
		Bolt bolt = new Bolt();
		mainCorridor.getDoor(rand.nextInt(mainCorridor.doors.size())).addItem(bolt);
		
		Candies candies = new Candies();
		mainCorridor.getDoor(rand.nextInt(mainCorridor.doors.size())).addItem(candies);
		
		Book book = new Book();
		mainCorridor.getDoor(rand.nextInt(mainCorridor.doors.size())).addItem(book);
		
		Spacesuit spacesuit = new Spacesuit();
		mainCorridor.getDoor(rand.nextInt(mainCorridor.doors.size())).addItem(spacesuit);
		
		Goggles goggles = new Goggles();
		mainCorridor.getDoor(rand.nextInt(mainCorridor.doors.size())).addItem(goggles);
		
		InvisibleWrench invisibleWrench = new InvisibleWrench();
		mainCorridor.getDoor(rand.nextInt(mainCorridor.doors.size())).addItem(invisibleWrench);

		GarbageChute garbageChute = new GarbageChute();
		garbageRoom.addItem(garbageChute);
		
		AlertMessage cockpitAlert = new AlertMessage("Warning - critical failure detected in the engine. Inspect immediately.");
		cockpit.addItem(cockpitAlert);
		System.out.println("You wake up feeling the bright, warm lights above and"
				+ " the cold metal floor beneath.");
		System.out.println("You see a blinking message on a screen to your side:");
		System.out.println("Urgent - the Captain's presence is requested in the cockpit.");
		transitionText();
		BasicLevel.makeDecision(ray, alloy, mainCorridor);
	}
		
}
