package linkedlist;

public class SinglyLinkedList<T> {

    public class Node<T> {
        public T data;
        public Node nextNode;
    }
    public Node headNode;
    public int size ;

    public  SinglyLinkedList(){
        headNode = null;
        size = 0;
    }
   /* Helper functions

    insertAtEnd(data)	Inserts an element at the end of the linked list
    insertAtHead(data)	Inserts an element at the start/head of the linked list
    insertAfter(index,data) Inserts an element after given index in the linked list

    delete(data)	    Deletes an element from the linked list
    deleteAtHead()	    Deletes the first element of the list
    deleteAtEnd()	    Deletes the last element of the list
    Search(data)	    Searches an element from the linked list
    isEmpty()	        Returns True if the linked list is empty, otherwise returns False*/

  public Boolean isEmpty(){
      if (headNode!= null){
          return true;
      } else {
          return false;
      }
  }
  public void insertAtHead(T data){
      Node newNode =  new Node ();
      newNode.data = data;

  }
}
