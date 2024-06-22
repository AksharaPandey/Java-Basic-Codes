import java.util.Scanner;

public class twoDarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cols=sc.nextInt();
        int rows=sc.nextInt();
        int[][] numbers=new int[rows][cols];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
