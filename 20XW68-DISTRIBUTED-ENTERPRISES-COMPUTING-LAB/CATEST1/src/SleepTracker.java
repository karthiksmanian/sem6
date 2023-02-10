import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class SleepTracker {

    static StringBuilder  displayTable(Connection connection) throws SQLException {
        StringBuilder sb = new StringBuilder();
        Statement statement = connection.createStatement();
        //Read
        ResultSet resultSet = statement.executeQuery("select * from sleep_stats");
        sb.append("\t\tSLEEP STATS\t\t\n");
        sb.append("id\t");
        sb.append("Time Of Sleep\t");
        sb.append("Wake Up Time\t");
        sb.append("Sleep Duration\n");

        while(resultSet.next())
        {
            String id = resultSet.getString("id");
            String tos = resultSet.getString("timeofsleep");
            String wut = resultSet.getString("wakeuptime");
            String dur = resultSet.getString("sleepduration");

            sb.append(id);
            sb.append("\t");
            sb.append(tos);
            sb.append("\t");
            sb.append(wut);
            sb.append("\t");
            sb.append(dur);
            sb.append("\n");
        }
        return sb;
    }

    static boolean UpdateValues(){
        //code
        return true;
    }

    public static void main(String[] args)
    {

        JFrame frame = new JFrame("Swing UI");
        JTextArea jta = new JTextArea();
        JButton button = new JButton("Display Stats");

        JPanel jPanel = new JPanel();
        jPanel.setSize(300, 200);
        jPanel.setLayout(new GridLayout(3, 3));

//        jPanel.add(new JLabel("Enter query:"));
//        JTextField tf1 = new JTextField();
//        tf1.setSize(200, 200);
//        jPanel.add(tf1);

        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root","sqladmin");

            //initial database schema
//            create database ps
//            use ps
//            create table human2(id int primary key,name char(20))
//            insert into human values(1,"hum1")
//            insert into human values(2,"hum2")
//            insert into human values(3,"hum3")

            //Create
//            String q = String.format("create table %s(id int,name char(10),num int)",name );
//            PreparedStatement statement0 = connection.prepareStatement(q);
//            statement0.executeUpdate();
//            System.out.println("Table created");


            //Insert
//            String q = "insert into human(id,name) values (?,?)";
//            PreparedStatement statement1 = connection.prepareStatement(q);
//            statement1.setString(1,"4");
//            statement1.setString(2,"hum4");
//
//            int noOfUpdates = statement1.executeUpdate();
//            if(noOfUpdates>0)
//            {
//                System.out.println(noOfUpdates+" rows inserted");
//            }

            //Update
//            String q = "update human set name=?,id=? where id=?";
//            PreparedStatement statement2 = connection.prepareStatement(q);
//            statement2.setString(1,"hum5");
//            statement2.setString(2,"5");
//            statement2.setString(3,"4");
//
//            int noOfUpdates = statement2.executeUpdate();
//            if(noOfUpdates>0)
//            {
//                System.out.println(noOfUpdates+" rows updated");
//            }


            //Delete
//            String q = "delete from human where id = ?";
//            PreparedStatement statement3 = connection.prepareStatement(q);
//            statement3.setString(1,"5");
//
//
//            int noOfUpdates = statement3.executeUpdate();
//            if(noOfUpdates>0)
//            {
//                System.out.println(noOfUpdates+" rows deleted");
//            }
            //Insert
            JButton button1 = new JButton("Add sleep Stats (Insert)");
            button1.setSize(300, 300);
            frame.add(button1);

            //Read

            //Update
            JButton button2 = new JButton("Update stats");
            button2.setSize(300, 300);
            frame.add(button2);

            //Delete
            JButton startButton  = new JButton("Delete stats");
            startButton.setSize(300, 300);
            frame.add(startButton);

            startButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    var ids = JOptionPane.showInputDialog("Primary key id : ");
                    String q = String.format("delete from sleep_stats where id=%s",ids);
                    try {
                        PreparedStatement statement0 = connection.prepareStatement(q);
                        statement0.executeUpdate();

                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });

            //display table records
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jta.setText("");
                    try {
                        jta.setText(displayTable(connection).toString());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                                var id = JOptionPane.showInputDialog("Enter Id");
                                var tos = JOptionPane.showInputDialog("Enter Time of sleep (as decimal)");
                                var wut = JOptionPane.showInputDialog("Enter Wake up Time (as decimal)");

                                String q = "insert into sleep_stats(id,timeofsleep,wakeuptime,sleepduration) values (?,?,?,?)";
                                try {
                                    PreparedStatement statement1 = connection.prepareStatement(q);
                                    statement1.setString(1, id);
                                    statement1.setString(2, tos);
                                    statement1.setString(3, wut);
                                    statement1.setString(4, (String.valueOf((12.00-Float.parseFloat(tos)) + + Float.parseFloat(wut))));

                                    int noOfUpdates = statement1.executeUpdate();
                                    if(noOfUpdates>0)
                                    {
                                        System.out.println(noOfUpdates+" rows inserted");
                                    }
                                }
                                catch (SQLException ex) {
                                    throw new RuntimeException(ex);
                                }

                }
            });



            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    var id = JOptionPane.showInputDialog("Enter Id");
                    var tos = JOptionPane.showInputDialog("Enter Time of sleep (as decimal)");
                    var wut = JOptionPane.showInputDialog("Enter Wake up Time (as decimal)");
                    String q = "update sleep_stats set timeofsleep=?,wakeuptime=?,sleepduration=?,id=? where id=?";
                    try{
                        PreparedStatement statement2 = connection.prepareStatement(q);
                        statement2.setString(1, tos);
                        statement2.setString(2, wut);
                        statement2.setString(3, (String.valueOf((12.00-Float.parseFloat(tos)) + + Float.parseFloat(wut))));
                        statement2.setString(4, id);
                        statement2.setString(5, id);
                        int noOfUpdates = statement2.executeUpdate();
                        if(noOfUpdates>0)
                        {
                            System.out.println(noOfUpdates+" rows updated");
                        }
                    }catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            });
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(jta);
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));

        frame.setVisible(true);
    }
}
