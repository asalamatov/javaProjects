import java.util.*;

public class BubbleSort {
    private static void printArray(String s, int x[]){
        System.out.println(s+" Array: ");
        for (int i: x){
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int x[]){
        printArray("Initial", x);
        int endPosition = x.length - 1;
        int swapPosition;

        while (endPosition>0){
            swapPosition = 0;

            for (int i=0; i<endPosition; i++){
                if (x[i]>x[i+1]){
                    int tmp = x[i];
                    x[i]=x[i+1];
                    x[i+1] = tmp;

                    swapPosition=i;
                }
                printArray("Current", x);
            }
            endPosition = swapPosition;
        }
        printArray("Sorted", x);
    }

    public static void main(String[] args){
        System.out.println("Enter the number of elements in the array: \n>>");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] unsorted = new int[n];
        System.out.println("Enter " + n + " integers separated by a space/enter\n>>");
        for (int i = 0; i<n; i++) {
            unsorted[i] = sc.nextInt();
        }
        sc.close();

        bubbleSort(unsorted);
    }
}

