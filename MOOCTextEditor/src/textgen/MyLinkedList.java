package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// Implement this method
		this.size = 0;
		this.head = new LLNode<E>(null);
		this.tail = new LLNode<E>(null);
		this.head.next = tail;
		this.tail.prev = head;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element )
	{
		// TODO: Implement this method
		if (element == null) {
			throw new NullPointerException();
			}
		
		LLNode<E> n =new LLNode<E>(element);
		
		if (size()==0) {
			n.prev=head;
			tail.prev=n;
			
			head.next=n;
			n.next=tail;
			
			size++;
			
		} else {
					
			n.prev=tail.prev;
			tail.prev=n;
			n.next=n.prev.next;
		//	n.next=tail;
			n.prev.next=n;
			
			
			size++;

		}		
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		LLNode<E> nodeAtIndex = head;
		for (int i=0; i<=index; i++) {
			nodeAtIndex = nodeAtIndex.next;
		}
		return nodeAtIndex.data;
		
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// Implement this method
		if (element == null) {
			throw new NullPointerException();
		}

    	if (index < 0 || (index > size())) {
			throw new IndexOutOfBoundsException("Index does not exist");
		}
		
		if (size()==index) {
			add(element);
			} else {

		LLNode<E> newNode = new LLNode<E>(element);

		LLNode<E> nodeAtIndex = head;
		for (int i = 0; i <= index; i++) {
			nodeAtIndex = nodeAtIndex.next;
		}

		/*newNode.next = nodeAtIndex.next;
		newNode.prev =nodeAtIndex.prev;
		newNode.next.prev = newNode;
		nodeAtIndex.next = newNode;*/
		
		
		newNode.prev=nodeAtIndex.prev;
		nodeAtIndex.prev=newNode;
		newNode.next=nodeAtIndex;
		newNode.prev.next=newNode;
		
//		nodeAtIndex.prev=nodeAtIndex.next.prev;
//		nodeAtIndex.next.prev=nodeAtIndex;
//		nodeAtIndex.next=nodeAtIndex.prev.next;	
//		nodeAtIndex.prev.next=nodeAtIndex;
		
		size++;
		}
	}


	/** Return the size of the list */
	public int size() 
	{
		// Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		
    	if (index < 0 || (index >= size())) {
			throw new IndexOutOfBoundsException("Index does not exist");
		}
    	
    	LLNode<E> nodeAtIndex = head;
		for (int i = 0; i <= index; i++) {
			nodeAtIndex = nodeAtIndex.next;
		}
		
		nodeAtIndex.next.prev=nodeAtIndex.prev;
		nodeAtIndex.prev.next=nodeAtIndex.next;
		
		size--;

    	
		return nodeAtIndex.data;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		return null;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
