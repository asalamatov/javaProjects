package runtime;

public class RunTimePractice {
    
    public static int findNumberOfRepetitions(String s, char c){
        int sum = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) ==c){
                sum++;
            }
        }

        return sum;
    }



    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        System.out.println(findNumberOfRepetitions("abc", 'c'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println(duration + " ms");
    }
}
