package om.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	boolean visited;
	boolean saved;
	List<Node> parents = new ArrayList<Node>();
	List<Node> children = new ArrayList<Node>();

	
	public int id;
	public String type;
	public String value;
	public int parentId;
	
	protected boolean process()
	{
		if(hasUnsavedParents())
			return false;
		else
		{
			id++;
			String json = String.format("{ id = '%d', parentId = '%d', type = '%s', value = '%s' }", id, parentId, type, value);
			System.out.println(json);
			return true;
		}
	}

	public Node getUnvisitedNode() {
		
		for(Node parent : parents)
			if(!parent.visited)
				return parent;
		
		for(Node child : children)
			if(!child.visited)
				return child;
		
		return null;
	}
	
	private boolean hasUnsavedParents()
	{
		return false;
	}
}
