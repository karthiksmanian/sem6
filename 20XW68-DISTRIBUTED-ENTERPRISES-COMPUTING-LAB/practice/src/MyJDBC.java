import java.sql.*;
//
////public class MyJDBC {
////    public static void main(String[] args) {

////    }
////}
//import java.awt.event.*;
//import javax.swing.*;
//
//public class MyJDBC {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Button Example");
//        JButton button = new JButton("Click Me");
//
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button clicked");
//            }
//        });
//
//        frame.add(button);
//        frame.setSize(200, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}
//
//
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJDBC {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Console Display");
        JButton button = new JButton("Display Records.");
        JTextArea textArea = new JTextArea();
        StringBuilder sb = new StringBuilder();

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root","sqladmin");
//            //insert
//            String q = "Insert into people(id,firstname,lastname) values(?,?,?)";
//            PreparedStatement s1 = connection.prepareStatement(q);
//            s1.setString(1,"3");
//            s1.setString(2,"Paulo");
//            s1.setString(3,"Dybala");
//
//            int noOfUpdates = s1.executeUpdate();
//            if(noOfUpdates>0){
//                System.out.println("Row inserted.");
//            }

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("Select * from people");
            sb.append("id");
            sb.append("\t");
            sb.append("firstname");
            sb.append("\t");
            sb.append("lastname");
            sb.append("\n");
            while(resultSet.next()){
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("firstname"));
                System.out.println(resultSet.getString("lastname"));
                System.out.println();
                sb.append(resultSet.getString("id"));
                sb.append("\t");
                sb.append(resultSet.getString("firstname"));
                sb.append("\t");
                sb.append(resultSet.getString("lastname"));
                sb.append("\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(""); // Clear the text area
                System.out.println("Button was pressed");
                textArea.append(sb.toString()); // Append the text to the text area
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(button);
        frame.add(textArea);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        frame.setVisible(true);
    }
}

