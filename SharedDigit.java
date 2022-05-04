public class SharedDigit{
    public static boolean hasSharedDigit(int num1,int num2){
        int numa=num1,numb=num2,flag=0;
        int rema,remb;
        if(!(numa>=10&&numa<100&&numb>=10&&numb<100)){
            return false;
        }
        else{
     while(numa>0){
         rema=numa%10;
         while (numb>0) 
         {
         remb=numb%10;
         if(rema==remb){
            flag=1;
            break;
            }
          numb=numb/10;    
         }
         numa=numa/10;
     }
     if(flag==1){
         return true;
     }
     else{
         return false;
     }
}}

    public static void main(String[] args) {
         System.out.println(hasSharedDigit(12,13));
    }
}