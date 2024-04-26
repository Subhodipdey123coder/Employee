package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.jar.JarEntry;

public class RemoveEmployee extends JFrame implements ActionListener {

    Choice choiceEmpId;
    JButton delete,back;
    RemoveEmployee(){
        JLabel lable=new JLabel("Employee Id");
        lable.setBounds(50,50,100,30);
        lable.setFont(new Font("Tahoma",Font.BOLD,20));
        add(lable);

        choiceEmpId=new Choice();
        choiceEmpId.setBounds(200,50,150,30);
        add(choiceEmpId);

        try {
            conn c=new conn();
            ResultSet result=c.statement.executeQuery("select * from employee");
            while(result.next()){
                choiceEmpId.add(result.getString("empId"));

            }

        }catch (Exception e){
            e.printStackTrace();
        }


        JLabel lableName=new JLabel("Name");
        lableName.setBounds(50,100,100,30);
        lableName.setFont(new Font("Tahoma",Font.BOLD,20));
        add(lableName);

        JLabel textname=new JLabel();
        textname.setBounds(200,100,100,30);
        add(textname);


        JLabel labelphone=new JLabel("Phone");
        labelphone.setBounds(50,150,100,30);
        labelphone.setFont(new Font("Tahoma",Font.BOLD,20));
        add(labelphone);

        JLabel textphone=new JLabel();
        textphone.setBounds(200,150,100,30);
        add(textphone);


        JLabel lableemail=new JLabel("Email");
        lableemail.setBounds(50,200,100,30);
        lableemail.setFont(new Font("Tahoma",Font.BOLD,20));
        add(lableemail);

        JLabel textemail=new JLabel();
        textemail.setBounds(200,200,100,30);
        add(textemail);

        try{
            conn c =new conn();
            ResultSet result=c.statement.executeQuery("select * from employee where empId='"+choiceEmpId.getSelectedItem()+"'");
            while(result.next()){
                textname.setText(result.getString("name"));
                textphone.setText(result.getString("phone"));
                textemail.setText(result.getString("email"));

            }


        }catch (Exception ee){
            ee.printStackTrace();
        }

        choiceEmpId.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{

                    conn c =new conn();
                    ResultSet result=c.statement.executeQuery("select * from employee where empId='"+choiceEmpId.getSelectedItem()+"'");
                    while(result.next()) {
                        textname.setText(result.getString("name"));
                        textphone.setText(result.getString("phone"));
                        textemail.setText(result.getString("email"));
                    }

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        delete=new JButton("Delete");
        delete.setBounds(80,300,100,30);
        delete.setBackground(Color.black);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);

        back=new JButton("Back");
        back.setBounds(220,300,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image l2 = l1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel image = new JLabel(l3);
        image.setBounds(700, 80, 200, 200);
        add(image);

        ImageIcon l11 = new ImageIcon(ClassLoader.getSystemResource("icons/rback.png"));
        Image l22 = l11.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon l33 = new ImageIcon(l22);
        JLabel image2 = new JLabel(l33);
        image2.setBounds(0, 0, 1120, 630);
        add(image2);







        setSize(1000,400);
        setLocation(300,150);
        setVisible(true);
        setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==delete){
            try{
                conn c=new conn();
                String query="delete from employee where empId='"+choiceEmpId.getSelectedItem()+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Employee Details Deleted Successfully");
                setVisible(false);
                new Main_class();

            }catch (Exception E){
                E.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
