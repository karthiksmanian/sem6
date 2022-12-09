class Person{
    String name;
    int age;
    boolean likesChocolate;

    public Person(String name, int age, boolean likesChocolate) {

        this.name = name;
        this.age = age;
        this.likesChocolate = likesChocolate;
    }

    public Person() {
    }
}

class Student extends Person{
    int std;
    String school;

    public Student(String name, int age, boolean likesChocolate, int std, String school) {
        super(name, age, likesChocolate);
        this.std = std;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "std=" + std +
                ", school='" + school + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", likesChocolate=" + likesChocolate +
                '}';
    }
}
public class Genralization {
    public static void main(String[] args) {

        Student s1 = new Student("pravin",19,true,12,"narayana mhss");
        System.out.println(s1.toString());

    }
}