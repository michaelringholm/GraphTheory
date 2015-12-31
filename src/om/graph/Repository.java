package om.graph;

public class Repository {

	public Node loadAll() {
		Node mc1 = new Node();
		mc1.id = 55;
		mc1.type = "MainCategory";
		mc1.value = "Gearbox";		
		
		Node cat1 = new Node();
		cat1.id = 25;
		cat1.parentId = 55;
		cat1.type = "Category";
		cat1.value = "CD_01";
		
		Node cat2 = new Node();
		cat2.id = 27;
		cat2.parentId = 55;
		cat2.type = "Category";
		cat2.value = "CD_02";
		
		Node catPrio1 = new Node();
		catPrio1.id = 88;
		catPrio1.parentId = 25;
		catPrio1.type = "CategoryPriority";
		catPrio1.value = "Carweb_2100";
		cat1.children.add(catPrio1);
		
		mc1.children.add(cat1);
		mc1.children.add(cat2);
		
		return mc1;
	}

}
