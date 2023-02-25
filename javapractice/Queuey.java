import java.util.LinkedList;
import java.util.Stack;

public class Queuey<D> {

    LinkedList<D> queue;

    public Queuey() {
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(D n){
        queue.addLast(n);
    }

    // public int dequeue(){
    //     return (int) queue.remove(0);
    // } 
    
    public D dequeue() {
        return queue.remove(0);
    }

    // public int peek() {
    //     return (int) queue.get(0);
    // }

    public D peek() {
        return queue.get(0);
    }
    

    public static void main(String[] args){
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        System.out.println("Peek: "+ stacky.peek());
        stacky.push("hi");
        System.out.println("Peek: "+ stacky.peek());
        System.out.print(stacky.pop() + " ");
        System.out.print(stacky.pop() + "!");
        Queuey numberQueue = new Queuey();
        // numberQueue.enqueue(5);
        // numberQueue.enqueue(7);
        // numberQueue.enqueue(6);
        numberQueue.enqueue("Hello");
        numberQueue.enqueue("World");
        numberQueue.enqueue("Azamat");
        System.out.println("First Out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second Out: "+ numberQueue.dequeue());
        System.out.println("Third Out: " + numberQueue.dequeue());
    }
}
