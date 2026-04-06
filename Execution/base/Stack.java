public interface Stack<E> {

	// Pushes an item onto the top of this stack.
	public E push(E item);

	// Removes the object at the top of this stack and returns it.
	// This method throws an exception if this queue is empty.
	public E pop();

	// Looks at the object at the top of this stack without removing it from the stack.
	// This method throws an exception if this queue is empty.
	public E peek();

	// Returns the number of items currently in the stack.
	public int size();

	// Tests if this stack is empty.
	public boolean isEmpty();

	// Prints the content of the stack.
	public void print();
}