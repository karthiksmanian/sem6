class SingleTon{
    static SingleTon obj;
    static Object mutex = new Object();

    int id;
    private SingleTon(int id){
        this.id = id;
    }
    public static SingleTon getInstance(){
        synchronized (mutex){
            if(obj==null){
                obj = new SingleTon((int) Math.random()%10);
            }
        }
        return obj;
    }
    public static void printHashCodes(SingleTon s1,SingleTon s2){
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.id);
        System.out.println(s2.id);
    }
}
class createObjects extends Thread{
    public void run(){
        do{
            SingleTon s = SingleTon.getInstance();
            System.out.println(s.hashCode());
        }while(true);
    }
}
public class Main {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        SingleTon s3 = SingleTon.getInstance();
        SingleTon s4 = SingleTon.getInstance();
        SingleTon s5 = SingleTon.getInstance();
        SingleTon s6 = SingleTon.getInstance();

//        createObjects c1 = new createObjects();
//        createObjects c2 = new createObjects();
//        c1.start();
////        c2.start();
//        Thread.yield();

        SingleTon.printHashCodes(s1,s2);
        SingleTon.printHashCodes(s3,s4);
        SingleTon.printHashCodes(s5,s6);
    }
}