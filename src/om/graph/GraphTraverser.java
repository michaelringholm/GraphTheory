package om.graph;

import java.util.Stack;

public class GraphTraverser {

	private Stack<Node> _stack;	
	
	public GraphTraverser()
	{
		_stack = new Stack<Node>();
	}
	
	public static void main(String[] args) {
		GraphTraverser traverser = new GraphTraverser();
		Repository repo = new Repository();
		Node mc1 = repo.loadAll();
		
		traverser.push(mc1);
		mc1.visited = true;
		mc1.process();
		
		traverser.traverse();
	}
	
	
	protected void push(Node node)
	{
		_stack.push(node);
	}
	
	protected Node pop()
	{
		return _stack.pop();
	}
	
	protected Node peek()
	{
		return _stack.peek();
	}
	
	protected boolean isStackEmpty()
	{
		return _stack.isEmpty();
	}
	
	public void traverse()
	{
		while(!_stack.isEmpty())
		{
			Node node = _stack.peek();
			Node childNode = node.getUnvisitedNode();
			
			if(childNode != null)
			{
				childNode.visited = true;
				childNode.process();
				push(childNode);
			}
			else
				pop();
		}
	}
}
