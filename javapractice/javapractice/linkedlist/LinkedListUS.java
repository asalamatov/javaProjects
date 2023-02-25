package javapractice.linkedlist;

import java.util.LinkedList;

public class LinkedListUS {
    
    // properties
    Node head;
    int count;

    //constructors
    // public LinkedList(){
    //     head = null;  // you cannot getNext() of a null;
    //     count = 0;
    // }

    public LinkedListUS(Node newHead){
        head = newHead;
        count = 1;
    }

    // methods

    //add
    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    //get
    public int get(int index){
        if (index <=0){
            return -1;
        }
        Node current = head;
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
        Node current = head;
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
