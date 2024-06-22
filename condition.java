import java.util.*;
public class condition{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();
        switch(button){
            case 1:System.out.println("HEY!");
            break;
            case 2:System.out.println("HELLO!");
            break;
            case 3:System.out.println("CIAO!");
            break;
            default: System.out.println("INVALID");
        }
    }
    

    
}