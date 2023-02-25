package javapractice.linkedlist;

public class Node<D> {
    Node<D> next;
    D data;

    public Node(D newData){
        data = newData;
        next = null;
    }

    public Node(D newData, Node<D> newNext){
        data = newData;
        next= newNext;
    }

    // getters
    public D getData(){
        return data;
    }

    public Node<D> getNext(){
        return next;
    }

    public void setData(D newData){
        data = newData;
    }

    public void setNext(Node<D> newNode){
        next = newNode;
    }
}
