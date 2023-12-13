import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Strategy{
    public static boolean visa(String cno){
        //code
        String regexp = "^4[0-9]{12}(?:[0-9]{3})?$";

        Pattern pattern = Pattern.compile(regexp);

        Matcher matcher = pattern.matcher(cno);
        boolean matches = matcher.matches();

        return matches;
    }
    public static boolean masterCard(String cno){
        //code
        String regexp = "^5[1-5][0-9]{14}$";

        Pattern pattern = Pattern.compile(regexp);

        Matcher matcher = pattern.matcher(cno);
        boolean matches = matcher.matches();

        return matches;
    }

    public static void pickStrategy(CreditCard card){
        if (card.brand=="visa"){
            if (visa(card.no)){
                System.out.println("Valid Card no.");
            }
            else {
                System.out.println("Invalid Card no.");
            }

        } else if (card.brand=="mastercard") {
            if (masterCard(card.no)){
                System.out.println("Valid Card no.");
            }else {
                System.out.println("Invalid card no.");
            }
        }else{
            System.out.printf("Does not match the list of providers known.\n");
        }
    }
}

class CreditCard{
    String no;
    String brand;
    public CreditCard() {
        //
    }
    public CreditCard(String no, String brand) {
        this.no = no;
        this.brand = brand;
    }

}
public class Main {
    public static void main(String[] args) {

        CreditCard c1 = new CreditCard("4111111111111111","visa");//v
        CreditCard c2 = new CreditCard("5555555555554444","mastercard");//v
        CreditCard c3 = new CreditCard("6011000990139424","discover");//iv
        CreditCard c4 = new CreditCard("4012888888881881","visa");//v
        CreditCard c5 = new CreditCard("2222405343248877","visa");//iv

        Strategy.pickStrategy(c1);
        Strategy.pickStrategy(c2);
        Strategy.pickStrategy(c3);
        Strategy.pickStrategy(c4);
        Strategy.pickStrategy(c5);

    }
}