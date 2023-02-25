package genericstemplates;

public class ArrayPractiveV2 {
    public static <E> void printArray(E[] array){
        for (E element : array){
            System.out.print(element + ", ");
        }
    }

    public static void main(String[] args){
        Integer[] intarr = {1,2,3,4,5,6,7};
        String[] strarray = {"aa", "aa", "aa", "aa", "aa", "aa"};

        printArray(intarr);
        System.out.println();
        printArray(strarray);
    }
}
