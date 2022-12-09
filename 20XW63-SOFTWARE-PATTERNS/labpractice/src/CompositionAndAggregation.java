class Engine{
    int cap;

    public Engine(int cap) {
        this.cap = cap;
    }

    public void engineDetails(){
        System.out.println("Engine capacity is "+ cap);
    }
}

class Paint{
    String color;

    public Paint(String color) {
        this.color = color;
    }

    public void paintDetails(){
        System.out.println("the paint color is  "+ color);
    }
}

class Tire{
    int no;

    public Tire(int no) {
        this.no = no;
    }

    public void tireDetails(){
        System.out.println("no of tires are : "+ no);
    }
}

class Car{
    Engine e;
    Tire t;
    Paint p;
    String model;
    public Car(int cap,int no,String color,String name) {
        this.e = new Engine(cap);
        this.t = new Tire(no);
        this.p = new Paint(color);
        this.model = name;
    }

    public void carDetails(){
        e.engineDetails();
        t.tireDetails();
        p.paintDetails();
        System.out.println("The name of the car is :"+model);
    }
}


public class CompositionAndAggregation {
    public static void main(String[] args) {

        {
            Car c1 = new Car(1000, 4, "black", "ambassador");
            c1.carDetails();
        }
        //cant be accesses here
        //System.out.println(c1.p.color);


    }
}
