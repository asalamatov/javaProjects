package dsa;

public class QuickFindUF1{
    private int[] id;

    public QuickFindUF1(int N){
        id = new int[N];
        for (int i=0; i<N; i++){
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return id[p]==id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i=0; i<id.length; i++){
            if (id[i]==pid) id[i]=qid;
        }
    }

    // i have just commited

    public static void main(String[] args){
        QuickFindUF1 qF = new QuickFindUF1(10);
        qF.union(5,6);
        qF.union(3,5);
        System.out.println(qF.connected(3, 6));
    }
}