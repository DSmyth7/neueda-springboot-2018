import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		sleepy.setImage("sleepy.png");
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		happy.setImage("happy.png");
		
		Dwarf dopey = new Dwarf();
		dopey.setName("Dopey");
		dopey.setAuthor("Disney");
		dopey.setImage("dopey.png");
		
		Dwarf bashful = new Dwarf();
		bashful.setName("Bashful");
		bashful.setAuthor("Disney");
		bashful.setImage("bashful.png");
		
		Dwarf sneezy = new Dwarf();
		sneezy.setName("Sneezy");
		sneezy.setAuthor("Disney");
		sneezy.setImage("sneezy.png");
		
		Dwarf doc = new Dwarf();
		doc.setName("Doc");
		doc.setAuthor("Disney");
		doc.setImage("doc.png");
		
		Dwarf grumpy = new Dwarf();
		grumpy.setName("Grumpy");
		grumpy.setAuthor("Disney");
		grumpy.setImage("grumpy.png");
		
		Dwarf thorin = new Dwarf("Thorin", "Tolkein", "thorin.png");
		Dwarf balin = new Dwarf("Balin", "Tolkein", "balin.png");
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkein", "dwalin.png");
		Dwarf fili = new Dwarf("Fili", "Tolkein", "fili.png");
		Dwarf kili = new Dwarf("Kili", "Tolkein", "kili.png");
		Dwarf dori = new Dwarf("Dori", "Tolkein", "dori.png");
		Dwarf nori = new Dwarf("Nori", "Tolkein", "nori.png");
		Dwarf ori = new Dwarf("Ori", "Tolkein", "ori.png");
		Dwarf oin = new Dwarf("Oin", "Tolkein", "oin.png");
		Dwarf gloin = new Dwarf("Gloin", "Tolkein", "gloin.png");
		Dwarf bifur = new Dwarf("Bifur", "Tolkein", "bifur.png");
		Dwarf bofur = new Dwarf("Bofur", "Tolkein", "bofur.png");
		Dwarf bomur = new Dwarf("Bomur", "Tolkein", "bomur.png");
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		dwarfs.add(sleepy);
		dwarfs.add(happy);
		dwarfs.add(dopey);
		dwarfs.add(bashful);
		dwarfs.add(sneezy);
		dwarfs.add(doc);
		dwarfs.add(grumpy);
		dwarfs.add(thorin);
		dwarfs.add(balin);
		dwarfs.add(dwalin);
		dwarfs.add(fili);
		dwarfs.add(kili);
		dwarfs.add(dori);
		dwarfs.add(nori);
		dwarfs.add(ori);
		dwarfs.add(oin);
		dwarfs.add(gloin);
		dwarfs.add(bifur);
		dwarfs.add(bofur);
		dwarfs.add(bomur);
		
		for(Dwarf dwarf:dwarfs) {
			System.out.println(dwarf.getName() + " - " + dwarf.getAuthor());
		}
			
	}

}
