package mercury.levels.levelOne;
import java.util.Random;

import mercury.core.beings.*;
import mercury.core.levels.BasicLevel;
import mercury.levels.levelOne.beings.Bug;
import mercury.levels.levelOne.rooms.CargoBay;
import mercury.levels.levelOne.rooms.Cockpit;
import mercury.levels.levelOne.rooms.CrewLounge;
import mercury.levels.levelOne.rooms.CrewQuarters;
import mercury.levels.levelOne.rooms.EngineRoom;
import mercury.levels.levelOne.rooms.MainCorridor;
import mercury.levels.levelOne.rooms.MedicalBay;
import mercury.levels.levelOne.rooms.StorageArea;

import mercury.levels.levelOne.items.Map;
import mercury.levels.levelOne.items.Bolt;
import mercury.levels.levelOne.items.Candies;
import mercury.levels.levelOne.items.Book;
import mercury.levels.levelOne.items.Spacesuit;
import mercury.levels.levelOne.items.Goggles;
import mercury.levels.levelOne.items.InvisibleWrench;

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
		
		//create beings
		Ray ray = new Ray(mainCorridor);
		mainCorridor.addBeing(ray);
		
		//random starting location for Alloy 
		Random rand = new Random();
		int randomInt = rand.nextInt(5);
		Alloy alloy = new Alloy(mainCorridor.getDoor(randomInt), ray);
		mainCorridor.getDoor(randomInt).addBeing(alloy);
		
		//random starting location for the bug
		randomInt = rand.nextInt(5);
		Bug bug = new Bug(mainCorridor.getDoor(randomInt));
		mainCorridor.getDoor(randomInt).addBeing(bug);
		
		//add items, some with random starting locations
		Map map = new Map();
		mainCorridor.getDoor(rand.nextInt(5)).addItem(map);
		
		Bolt bolt = new Bolt();
		mainCorridor.getDoor(rand.nextInt(5)).addItem(bolt);
		
		Candies candies = new Candies();
		mainCorridor.getDoor(rand.nextInt(5)).addItem(candies);
		
		Book book = new Book();
		mainCorridor.getDoor(rand.nextInt(5)).addItem(book);
		
		Spacesuit spacesuit = new Spacesuit();
		mainCorridor.getDoor(rand.nextInt(5)).addItem(spacesuit);
		
		Goggles goggles = new Goggles();
		mainCorridor.getDoor(rand.nextInt(5)).addItem(goggles);
		
		InvisibleWrench invisibleWrench = new InvisibleWrench();
		mainCorridor.getDoor(rand.nextInt(5)).addItem(invisibleWrench);
				
		BasicLevel.makeDecision(ray);
	}
		
}
