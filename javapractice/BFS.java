import java.util.*;
class Node{
    Node left, right;
    int data;
    Node(int data){
        this.data = data;
        left=right=null;
    }
}


class BFS{
    static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<Node>();
        if (root!=null){
            q.add(root);
            while(!q.isEmpty()){
                Node n = q.remove();
                System.out.print(n.data + " ");
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.left!=null){
                    q.add(n.right);
                }
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }else{
            Node cur;
            if(data<=root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int T = scanner.nextInt();  //number of elements in the tree
            Node root= null;
            while(T-->0){
                int data = scanner.nextInt();
                root = insert(root, data);
            }
            levelOrder(root);
        }
    }
}