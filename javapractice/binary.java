
public class binary{

    public static String toBinary(int a){
        if (a<=1){
            return String.valueOf(a);
        }
        return toBinary(a/2) + String.valueOf(a%2);
    }
    public static void main(String[] args){
        String binaryNumber = toBinary(200);
        System.out.println(binaryNumber);
        int count = 0;
        for (int i =0; i<binaryNumber.length();i++){
            if (binaryNumber.charAt(i)=='0'){
                count =0;
            }else{
                ++count;
            }
        System.out.print(count);
        }
    }
}