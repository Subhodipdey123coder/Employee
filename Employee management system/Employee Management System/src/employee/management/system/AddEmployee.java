package employee.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddEmployee extends JFrame implements ActionListener {
    Random ran=new Random();
    int num=ran.nextInt(100000,9999999);
    JTextField tname,tfname,taddress,tphone,taddhar,temail,tsalary,tdesignation,tdesignation2;
    JDateChooser tdob;
    JLabel tempid;
    JComboBox teducation;
    JButton add,back;
    AddEmployee(){

        getContentPane().setBackground(new Color(220, 177, 252));

        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 25));
        add(heading);


        // Here the inputs taken by the user

        JLabel name = new JLabel("Name");
        name.setBounds(50, 150, 150, 30);
        name.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(name);

        JTextField tname = new JTextField();
        tname.setBounds(200, 150, 150, 30);
        tname.setBackground(new Color(255, 255, 255));
        add(tname);


        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400, 150, 150, 30);
        fname.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(fname);

        tfname = new JTextField();
        tfname.setBounds(600, 150, 150, 30);
        tfname.setBackground(new Color(255, 255, 255));
        add(tfname);


        JLabel dob = new JLabel("Date-Of-Birth");
        dob.setBounds(50, 200, 150, 30);
        dob.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(dob);

        tdob=new JDateChooser();
        tdob.setBounds(200,200,150,30);
        tdob.setBackground(new Color(255,255,255));
        add(tdob);





        JLabel salary = new JLabel("Salary");
        salary.setBounds(400, 200, 150, 30);
        salary.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(600, 200, 150, 30);
        tsalary.setBackground(new Color(255, 255, 255));
        add(tsalary);


        JLabel address = new JLabel("Address");
        address.setBounds(50, 250, 150, 30);
        address.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(address);

        taddress = new JTextField();
        taddress.setBounds(200, 250, 150, 30);
        taddress.setBackground(new Color(255, 255, 255));
        add(taddress);


        JLabel phone = new JLabel("Phone No");
        phone.setBounds(400, 250, 150, 30);
        phone.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(600, 250, 150, 30);
        tphone.setBackground(new Color(255, 255, 255));
        add(tphone);

        JLabel email = new JLabel("Email");
        email.setBounds(50, 300, 150, 30);
        email.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(email);

        temail = new JTextField();
        temail.setBounds(200, 300, 150, 30);
        temail.setBackground(new Color(255, 255, 255));
        add(temail);


        JLabel education = new JLabel("Highest Qualification");
        education.setBounds(400, 300, 150, 30);
        education.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(education);
        ;
        String items[] = {"B.Tech", "BBA", "BCA", "B.Com", "MCA", "MBA", "PHD", "10th Pass", "12th pass"};
        teducation = new JComboBox((items));
        teducation.setBackground(new Color(255, 255, 255));

        teducation.setBounds(600, 300, 150, 30);
        add(teducation);


        JLabel addhar = new JLabel("Addhar-No");
        addhar.setBounds(400, 350, 150, 30);
        addhar.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(addhar);

        taddhar = new JTextField();
        taddhar.setBounds(600, 350, 150, 30);
        taddhar.setBackground(new Color(255, 255, 255));
        add(taddhar);

        JLabel empid = new JLabel("Employee ID");
        empid.setBounds(50, 400, 150, 30);
        empid.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(empid);

        tempid = new JLabel("" + num);
        tempid.setBounds(200, 400, 150, 30);
        tempid.setBackground(new Color(255, 255, 255));
        tempid.setFont(new Font("SAN_SARIF", Font.BOLD, 25));
        tempid.setForeground(Color.RED);
        add(tempid);

        JLabel designation = new JLabel("Designation");
        designation.setBounds(50, 350, 150, 30);
        designation.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(designation);

        tdesignation = new JTextField();
        tdesignation.setBounds(200, 350, 150, 30);
        tdesignation.setBackground(new Color(255, 255, 255));
        add(tdesignation);

        // Here the add and back button

        add = new JButton("Add");
        add.setBounds(450, 550, 150, 40);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBounds(250, 550, 150, 40);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        JLabel designation2 = new JLabel("Designation");
        designation2.setBounds(222222, 222222, 150, 30);
        designation2.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        add(designation2);

        tdesignation2 = new JTextField();
        tdesignation2.setBounds(222222, 222222, 150, 30);
        tdesignation2.setBackground(new Color(255, 255, 255));
        add(tdesignation2);


        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
        setLayout(null);

    }

    // Add and Back Button functions

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String name=tname.getText();
            String Fname=tfname.getText();
            String dob=((JTextField)tdob.getDateEditor().getUiComponent()).getText();
            String salary=tsalary.getText();
            String address=taddress.getText();
            String phone=tphone.getText();
            String email=temail.getText();
            String education=(String)teducation.getSelectedItem();
            String designation=tdesignation.getText();
            String Addhar=taddhar.getText();
            String empId=tempid.getText();


            try {
                conn c =new conn();
                String query="insert into employee values('"+name+"','"+Fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+Addhar+"','"+empId+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details Added Successfully"); // It throws a massage when the details added in tha database
                setVisible(false);
                new Main_class();

            }catch (Exception E){
                E.printStackTrace();
            }

        }
        else {
            setVisible(false);
            new Main_class();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
        
    }

}
