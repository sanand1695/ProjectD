import java.util.*;

public class BinarySearchTreeWithDups<T extends Comparable<? super T>> extends BinarySearchTree<T>
		implements SearchTreeInterface<T>, java.io.Serializable {

	public BinarySearchTreeWithDups() {
		super();
	}

	public BinarySearchTreeWithDups(T rootEntry) {
		super(rootEntry);
		setRootNode(new BinaryNode<T>(rootEntry));
	}

	@Override
	public T add(T newEntry) {
		T result = newEntry;
		if (isEmpty()) {
			setRootNode(new BinaryNode<T>(newEntry));
		} else {
			addEntryHelperNonRecursive(newEntry);
		}
		return result;
	}
	
	// YOUR CODE HERE! THIS METHOD CANNOT BE RECURSIVE.
	// PART A - Question 1
	// The helper method allows duplicate entries to be added.
	
	
	private void addEntryHelperNonRecursive(T newEntry) {
		
		BinaryNode<T> currentNode = getRootNode();
		T result  = null;
		boolean foundIt = false;
		
		while(!foundIt) {
		
			int comparison = newEntry.compareTo(currentNode.getData());
		
//	If the new element is smaller or equal to current element, go into the left subtree.
	
		if (comparison <= 0) {
			if(currentNode.hasLeftChild()) {
		   currentNode= currentNode.getLeftChild();
		}
			else {
				currentNode.setLeftChild(new BinaryNode<>(newEntry));
				foundIt = true;
				result = currentNode.getData();
			}
			
//	If the new element is larger, go into the right subtree.
		} else if(comparison > 0){
			if(currentNode.hasRightChild()) {
				
				currentNode = currentNode.getRightChild(); 
			}else {
				
				currentNode.setRightChild(new BinaryNode<>(newEntry));
				foundIt = true;
				result = currentNode.getData();
		} 
	}

}
	}
	// YOUR CODE HERE! THIS METHOD CANNOT BE RECURSIVE.
	// MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
	// PART B - Question 2
	public int countEntriesNonRecursive(T target) {
		// this initial code is meant as a suggestion to get your started- use it or delete it!
		int count = 0;
		BinaryNode<T> currentNode = getRootNode();

		// consider a loop!
		
		return count;
	}

	// YOUR CODE HERE! MUST BE RECURSIVE! YOU ARE ALLOWED TO CREATE A PRIVATE HELPER.
	// MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
	// Part A - Question 3
	public int countGreaterRecursive(T target) {
		// this initial code is meant as a suggestion to get your started- use it or delete it!
		int count = 0;
		BinaryNode<T> rootNode = getRootNode();
		
		// consider a helper method!
		
		return count;
	}
		
	// YOUR CODE HERE! MUST USE A STACK!! MUST NOT BE RECURSIVE! 
	// MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
	// Part A - Question 4
	public int countGreaterWithStack(T target) {
		// this initial code is meant as a suggestion to get your started- use it or delete it!
		int count = 0;
		BinaryNode<T> rootNode = getRootNode();
		Stack<BinaryNode<T>> nodeStack = new Stack<BinaryNode<T>>();
		nodeStack.push(rootNode);

		// consider a loop based on the stack!
		return count;
	}
		
	// YOUR EXTRA CREDIT CODE HERE! THIS METHOD MUST BE O(n). 
	// YOU ARE ALLOWED TO USE A HELPER METHOD. THE METHOD CAN BE ITERATIVE OR RECURSIVE. 
	public int countUniqueValues() {
		return 0;
	}
	
	
	
	public int getLeftHeight() {
		BinaryNode<T> rootNode = getRootNode();
		if(rootNode==null) {
			return 0;
		} else if(!rootNode.hasLeftChild()) {
			return 0;
		} else {
			return rootNode.getLeftChild().getHeight();
		}
	}

	public int getRightHeight() {
		BinaryNode<T> rootNode = getRootNode();
		if(rootNode==null) {
			return 0;
		} else if(!rootNode.hasRightChild()) {
			return 0;
		} else {
			return rootNode.getRightChild().getHeight();
		}
	}
	


}