import java.util.Scanner;

public class function {
    public static void printMyName(String Name){
        System.out.println(Name);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);
    }
    
}
