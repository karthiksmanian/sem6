interface ISerializerAdapter{
     void Serialize(PersonInfo p);
}
class JSONSerializerAdapter implements ISerializerAdapter{
    @Override
    public void Serialize(PersonInfo p) {
        System.out.println(p.toString());
    }
}
class XMLSerializerAdapter implements ISerializerAdapter{
    @Override
    public void Serialize(PersonInfo p) {
        System.out.println("XML Serializer.");
    }
}
class PersonInfo{
    String name;
    int age;
    public PersonInfo(){
        name = "sample";
        age  = 0;
    }
    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Q2 {
    public static void main(String[] args) {
        PersonInfo p1 = new PersonInfo();
        PersonInfo p2 = new PersonInfo();
        JSONSerializerAdapter j = new JSONSerializerAdapter();
        j.Serialize(p1);
    }
}
