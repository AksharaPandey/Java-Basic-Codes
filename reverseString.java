public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Chhotu");
        for(int i=0;i<sb.length()/2;i++){
            int back=sb.length()-i-1;
            int front=i;
            char frontChar=sb.charAt(i);
            char backChar=sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
    
}
