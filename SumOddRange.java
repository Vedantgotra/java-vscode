

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
    int i,count=0;
   
       if(start<0||end<0){
           return -1;
       }
       else if(start>end){
           return -1;
       }
       for(i=start;i<=end;i++){
        if(isOdd(i)){
          count=count+i; 
    
       }

     }
     return count;
 
}    

public static void main(String[] args) {
    System.out.println(isOdd(23));
    System.out.println(sumOdd(10, 5));
    
}
}