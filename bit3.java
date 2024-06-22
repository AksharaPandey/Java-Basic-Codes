import java.util.Scanner;

public class bit3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int pos=1;
        int number=5;
        int bitmask=1<<pos;
      
        if(oper==1){
            
            int newNumber=bitmask|number;
            System.out.println(newNumber);

        }
        else{
            int newbitmask=~(bitmask);
            int newNumber=newbitmask&number;
          System.out.println(newNumber);
        }
    }
}