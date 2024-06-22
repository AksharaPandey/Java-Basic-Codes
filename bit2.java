public class bit2 {
    public static void main(String[] args) {
        //Clear Bit Operation
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notbitmask=~(bitmask);
        int newNumber=notbitmask&n;
        System.out.println(newNumber);
    }
    
}
