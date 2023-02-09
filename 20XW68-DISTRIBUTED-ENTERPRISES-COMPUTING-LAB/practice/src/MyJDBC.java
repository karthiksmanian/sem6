import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root","sqladmin");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("Select * from people");

            while(resultSet.next()){
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("firstname"));
                System.out.println(resultSet.getString("lastname"));
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
