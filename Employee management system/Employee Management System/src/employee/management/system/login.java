package employee.management.system;
import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;



public class login extends JFrame implements ActionListener {
    JTextField tusername;
    JPasswordField tpassword;
    JButton login,back;
    login(){



        JLabel username = new JLabel("Username");
        username.setBounds(40, 20, 100, 30);
        add(username);

        tusername=new JTextField();
        tusername.setBounds(150,20,150,30);
        add(tusername);

        JLabel password = new JLabel("Password");
// Adjust the x-coordinate to position the "Password" label to the right of the "Username" label
        password.setBounds(40, 70, 100, 30);
        add(password);

        tpassword=new JPasswordField();
        tpassword.setBounds(150,70,150,30);
        add(tpassword);

        login=new JButton(("LogIn"));
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        ImageIcon l11 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image l22 = l11.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon l33 = new ImageIcon(l22);
        JLabel imgg = new JLabel(l33);
        imgg.setBounds(350, 10, 600, 400);
        add(imgg);


        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));
        Image l2 = l1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel img = new JLabel(l3);
        img.setBounds(0, 0, 600, 300);
        add(img);

        back=new JButton(("back"));
        back.setBounds(150,180,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);







        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==login){
            try {
                String username=tusername.getText(); // it helps to take the data and convert it into String
                String password=tpassword.getText();

                conn conn=new conn();


                String query="select * from login where username = '"+ username +"' and password = '"+password+"'"; // it takes the data from the username and password table coloum name
                ResultSet resultset=conn.statement.executeQuery(query);

                if(resultset.next()){
                    setVisible(false);
                    new Main_class(); //it calls the Main_class and appear when the data matched
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid username and password"); // Show the massage if the data is not matched with the database data
                }

            }catch (Exception E){
                E.printStackTrace();

            }

        } else if ((e.getSource()==back)) {
            System.exit(90);
        }

    }

    public static void main(String[] args) {

        new login();
    }

}
