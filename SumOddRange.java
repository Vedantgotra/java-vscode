

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0)
            return false;
        else if (number % 2 != 0) {
            return true;
        }
        return false;

    }

public static int sumOdd(int start,int end){
    int i;
   for(i=start;i<end;i++){
       if(isOdd(i)){
       return i;
       }
     }
 
}    

public static void main(String[] args) {
    System.out.println(isOdd(23));
    System.out.println(sumOdd(1, 25));
    
}
}