package javapractice.linkedlist;

import java.util.LinkedList;

public class LinkedListUS<D> {
    
    // properties
    Node<D> head;
    int count;

    //constructors
    // public LinkedList(){
    //     head = null;  // you cannot getNext() of a null;
    //     count = 0;
    // }

    public LinkedListUS(Node<D> newHead){
        head = newHead;
        count = 1;
    }

    // methods

    //add
    public void add(D newData){
        Node<D> temp = new Node(newData);
        Node<D> current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    //get
    public D get(int index){
        // if (index <=0){
        //     return -1;
        // }
        Node<D> current = head;
        for (int i=1; i<index; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    //size
    public int size(){
        return count;
    }

    //isEmpty
    public boolean isEmpty(){
        return head==null;
    }

    //remove
    public void remove(){
        // remove from the end of the list
        Node<D> current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add(0, "Alice");
        System.out.println(linkedList);
    }
}
