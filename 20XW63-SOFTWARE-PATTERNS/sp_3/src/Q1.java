import java.util.ArrayList;
import java.util.List;
interface Explorer{
    void delete();
}
abstract class Item{
    abstract void delete();
}
class File extends Item{
    @Override
    void delete() {
        System.out.println("File's Delete Method is invoked.");
    }
}
class Folder extends Item{
    static List<Item> li = new ArrayList<Item>();
    @Override
    void delete() {
        System.out.println("Folder's delete method is invoked.");
    }
    void add(Item item){
        System.out.println("The passed item is added in the list.");
        li.add(item);
    }
    void remove(Item item){
        if(li.remove(item)){
            System.out.println("Item removed successfully.");
        }else {
            System.out.println("Item removal unsuccessful.");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}