package dsa;

public class QuickUnion3Weighting {
    private int[] id;
    private int[] size;

    public QuickUnion3Weighting(int N){
        id = new int[N];
        size = new int[N];
        for (int i=0; i<N; i++){
            id[i] = i;
            size[i] = 1;
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
        int rootP = root(p);
        int rootQ = root(q);
        if (rootP == rootQ) return;
        if (size[rootP] > size[rootQ]){
            id[rootQ] = rootP;
            size[rootP] += size[rootQ];
        } else {
            id[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
    }

    public static void main(String[] args){
        QuickUnion3Weighting qF = new QuickUnion3Weighting(10);
        qF.union(5,6);
        qF.union(3,5);
        System.out.println(qF.connected(3, 6));
    }
}
