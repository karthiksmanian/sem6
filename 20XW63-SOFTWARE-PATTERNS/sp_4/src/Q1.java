class A{
    public void doX(int x){

        if(x<10){
            B.calculate();
        }
        else{
            C.calculate();
        }
    }
}

class B{
    public static void calculate(){
        System.out.println("calculate method in B is called");
    }
}

class C{
    public static void calculate(){
        System.out.println("calculate method in C is called");
    }
}
public class Q1 {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        A aObj = new A();
        aObj.doX(10);
    }

}