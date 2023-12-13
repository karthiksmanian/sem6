class NumberTools{
    public static int factorial(int n){
        if(n<1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(NumberTools.factorial(5));
    }
}