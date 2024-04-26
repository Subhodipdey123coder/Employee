package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class(){

        // Image set for the background....
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image l2=l1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon((l2));
        JLabel img=new JLabel(l3);
        img.setBounds(0,0,1120,630);
        add(img);

        // Set the heading
        JLabel heading=new JLabel("Employee Management System");
        heading.setBounds(340,140,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        img.add(heading); // here the img.add is used for the heading is set on the upper layer of the background img...

        // Add Employee button
        JButton add=new JButton("Add Employee");
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.setBounds(335,270,150,40);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        img.add(add);

        // View Employee button
        JButton view=new JButton("View Employee");
        view.setBackground(Color.black);
        view.setForeground(Color.WHITE);
        view.setBounds(568,270,150,40);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new ViewEmployee();
                    setVisible(false);
            }
        });
        img.add(view);

        // Remove Employee button
        JButton rem=new JButton("Remove Employee");
        rem.setBackground(Color.black);
        rem.setForeground(Color.WHITE);
        rem.setBounds(440,370,150,40);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();


            }
        });
        img.add(rem);



        // Set the attributes of the panel
        setSize(1120,630);
        setLocation(200,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_class();


    }

}
