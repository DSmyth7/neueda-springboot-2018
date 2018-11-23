package uk.ac.belfastmet.springbootbuildings.service;

import java.util.ArrayList;

import uk.ac.belfastmet.springbootbuildings.domain.FootprintBuilding;
import uk.ac.belfastmet.springbootbuildings.domain.VolumeBuilding;


public class BuildingService {
	
	public BuildingService() {
		super();
	}
	
	public ArrayList<VolumeBuilding> getVolumeBuildings(){
		ArrayList<VolumeBuilding> volumeBuildings = new ArrayList<VolumeBuilding>();
		
		VolumeBuilding boeingEverett = new VolumeBuilding("Boeing Everett Factory", "United States", "Everett, Washington","BoeingEverett.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.763882469593!2d-122.29196358435843!3d47.921605979206795!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54900164f9502991%3A0x903b231982d227fd!2sFuture+Of+Flight+Museum!5e0!3m2!1sen!2suk!4v1542975511210\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "398,000 m(2)", "13.3 million m(3)", "Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.");
		volumeBuildings.add(boeingEverett);
		VolumeBuilding mecca = new VolumeBuilding("Great Mosque of Mecca", "Saudi Arabia", "Hijaz", "Mecca.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3714.1621309239213!2d39.823546014939375!3d21.422871385786248!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204b74d3fb493%3A0x55d1f94f8e094785!2sMasjid+al-Haram!5e0!3m2!1sen!2suk!4v1542975602402\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "356,000 m(2)",  "8 million m(3)", "The largest mosque in the world, the most sacred place for the Muslims, and surrounds Islam's holiest place, the Kaaba.");
		volumeBuildings.add(mecca);
		VolumeBuilding jeanluc = new VolumeBuilding("Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", "Jean.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2624.156004353851!2d2.302882015570179!3d48.87430250754037!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47e66fc11f18fca7%3A0xec0b93ef7217c012!2sFondation+Jean-Luc+Lagard%C3%A8re!5e0!3m2!1sen!2suk!4v1542975660290\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "122,500 m(2)", "5.6 million m(3)", "The assembly hall of the Airbus A380, the world's largest airliner. Built in Toulouse, France.");
		volumeBuildings.add(jeanluc);
		VolumeBuilding boeingComposite = new VolumeBuilding("Boeing Wing Center", "United States", "Everett, Washington", "BoeingWing.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3070.5774434540044!2d-75.75137238469917!3d39.681718907935355!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c7aa3005e0dc05%3A0xad7975bcf3fbe223!2sComposites+Manufacturing+Science+Laboratory%2C+Newark%2C+DE+19716%2C+USA!5e0!3m2!1sen!2suk!4v1542975711803\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "111,500 m(2)", "3.7 million m(3)" , "Boeing's assembly site for the production of composite wings for the 777-8 and 777-9.");
		volumeBuildings.add(boeingComposite);
		VolumeBuilding aerium = new VolumeBuilding("Aerium", "Germany", "Halbe, Brandenburg", "Aerium.gif", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d78462.51490408857!2d13.629779212310023!3d52.08057469361476!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47a81a9bc503ea23%3A0xf719fcad369b2d67!2s15757+Halbe%2C+Germany!5e0!3m2!1sen!2suk!4v1542975776914\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "70,000 m(2)", "5.2 million m(3)", "A hangar originally intended to house the construction of a giant airship, this building now houses an indoor theme park.");
		volumeBuildings.add(aerium);

		return volumeBuildings;
	}
	
	public ArrayList<FootprintBuilding> getFootprintBuildings(){
		ArrayList<FootprintBuilding> footprintBuildings = new ArrayList<FootprintBuilding>();
		
		FootprintBuilding aalsmeer = new FootprintBuilding("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer","Aalsmeer.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2442.179379911313!2d4.780398215797716!3d52.25828757976547!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c5de25f43ac82d%3A0x7e6ba34cf4c92c79!2sVba+bloemenveiling!5e0!3m2!1sen!2suk!4v1542986178633\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "518,000 m(2)", "740 m x 700 m", "The auction building of the flower auction in Aalsmeer.");
		footprintBuildings.add(aalsmeer);
		FootprintBuilding dubaiMall = new FootprintBuilding("The Dubai Mall", "United Arab Emirates", "Dubai", "dubaimall.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3610.171365243483!2d55.277309214990574!3d25.197442837873922!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f682829c85c07%3A0xa5eda9fb3c93b69d!2sThe+Dubai+Mall!5e0!3m2!1sen!2suk!4v1542986399926\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "500,000 m(2)",  "Unknown", "Second-largest mall in the world by total land area.");
		footprintBuildings.add(dubaiMall);
		FootprintBuilding teslaFactory = new FootprintBuilding("Tesla Factory", "United States", "Fremont, California", "Tesla.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3166.703543394878!2d-121.92893838475605!3d37.46772093753878!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fb075776f1c3b%3A0xbe8bdd05c7262318!2sTesla+Service!5e0!3m2!1sen!2suk!4v1542986960452\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "427,354 m(2)", "Unknown", "Automobile production facility of Tesla Motors.");
		footprintBuildings.add(teslaFactory);
		FootprintBuilding boeingEverett = new FootprintBuilding("Boeing Everett Factory", "United States", "Everett, Washington", "BoeingEverett.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.763882469589!2d-122.29196358443069!3d47.92160597920688!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54900164f9502991%3A0x903b231982d227fd!2sFuture+Of+Flight+Museum!5e0!3m2!1sen!2suk!4v1542988216801\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "398,000 m(2)", "900 m x 495 m" , "Boeing's assembly site for a selection of the company's largest aircraft.");
		footprintBuildings.add(boeingEverett);
		FootprintBuilding daikin = new FootprintBuilding("Daikin Texas Tech Park", "United States", "Waller, Texas", "Daikin.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d78462.51490408857!2d13.629779212310023!3d52.08057469361476!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47a81a9bc503ea23%3A0xf719fcad369b2d67!2s15757+Halbe%2C+Germany!5e0!3m2!1sen!2suk!4v1542975776914\" width=\"100%\" height=\"250\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "393,000 m(2)", "Unknown", "Factory and distribution center for heating and air conditioning products");
		footprintBuildings.add(daikin);

		return footprintBuildings;
	}
	
}
