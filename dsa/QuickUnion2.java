package dsa;

public class QuickUnion2 {
    private int[] id;

    public QuickUnion2(int N){
        id = new int[N];
        for (int i=0; i<N; i++){
            id[i] = i;
        }
    }

    private int root(int i){
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q){
        return root(p)==root(q);
    }
    
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public static void main(String[] args){
        QuickUnion2 qF = new QuickUnion2(10);
        qF.union(5,6);
        qF.union(3,5);
        System.out.println(qF.connected(3, 6));
    }
}
