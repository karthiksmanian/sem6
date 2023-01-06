import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Client{
    String accessToken;
    public Client(){
        accessToken = AuthorizationServer.accessTokenGenerator(this);
    }
    public String getAccessToken(){
        return accessToken;
    }

    public boolean apiRequest(){
        System.out.printf("An api request call is generated from the object having hashcode %s\n",this.hashCode());
        boolean access = ResourceServer.handleRequest(this.accessToken);
        return access;
    }
}

class ResourceServer{
    public static boolean handleRequest(String accessToken){
        boolean validity = AuthorizationServer.validateAccessToken(accessToken);
        return validity;
    }
}
class AuthorizationServer{
    public static String accessTokenGenerator(Client c){
        return c.toString();
    }
    public static boolean validateAccessToken(String acToken){
        boolean flag = false;
        //        System.out.println(acToken.substring(0,7));
//        if(acToken.startsWith("Client@")){
//            String tokenText = acToken.substring(7);
//            String regex = "[0-9a-z]+";
//
//            Pattern pattern = Pattern.compile(regex);
//
//            Matcher matcherText = pattern.matcher(tokenText);
//            boolean textMatches = matcherText.matches();
//            System.out.println(textMatches);
//            if(textMatches){
//                flag = true;
//            }
//        }
        String tokenText = acToken;
        String regex = "Client@?[0-9a-z]+";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcherText = pattern.matcher(tokenText);
        boolean textMatches = matcherText.matches();

        if(textMatches){
            flag = true;
        }
        return flag;
        //code
    }
}
public class Q2 {
    public static void main(String[] args) {
        Client c1 = new Client();
        Client c2 = new Client();
        System.out.println("Access Token generated:");
        System.out.println(c1.getAccessToken());
        System.out.println(c2.getAccessToken());

        if(c1.apiRequest()){
            System.out.println("Access Granted.");
        };
        if(c2.apiRequest()){
            System.out.println("Access Granted.");
        }
    }
}
