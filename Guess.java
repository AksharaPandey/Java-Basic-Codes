public class Guess {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int d[]=a;
        int sum=0;
        for(int j=1;j<3;j++){
            sum +=(a[j] =d[j]);
            System.out.println(sum);
        }
    }

}
