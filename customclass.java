class employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My name is"+name);
        System.out.println("My id is"+id);
    }
    

}
public class customclass {
    public static void main(String[] args) {
        System.out.println("This is my custom class");
        employee akshara=new employee();
        akshara.id=12;
        akshara.name="Chhotu ki wife";
        akshara.printDetails();
        /*System.out.println(akshara.id);
        System.out.println(akshara.name);*/
    }
    
}
