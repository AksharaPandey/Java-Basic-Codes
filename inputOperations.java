import java.util.*;
public class inputOperations{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        //SUM
        int sum=a+b;
        System.out.println(sum);
        //DIFFERENCE
        int diff=a-b;
        System.out.println(diff);
        //PRODUCT
        int product =a*b;
        System.out.println(product);
        //DIVISION
        float div=a/b;
        System.out.println(div);
    }
}