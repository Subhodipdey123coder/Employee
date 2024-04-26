package employee.management.system;
import javax.swing.*;
import java.awt.Image;
// 👆👆 this module import is for the Image class

public class Splash extends JFrame {
    // create the constructor >>>
    Splash() {

        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
        Image l2 = l1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel image = new JLabel(l3);
        image.setBounds(0, 0, 1170, 650);
        add(image);


        // here the code is for making the frame

        setSize(1170, 650); // setSize (Width,Height)
        setLayout(null); // Layout null because we adjust the icons position as i want
        setVisible(true);
        setLocation(200, 100); // It set the location where the pop up panel will appear (X-direction,Y-direction)

        try
        {
            // This is function to close the panel after 5 sec...
            Thread.sleep(5000); // Set the time
            setVisible(false); //Close the panel
            new login();

        }catch (Exception e){
            e.printStackTrace();
        }



    }


    public static void main(String[] args) {

        new Splash(); // create the object for the constructor

    }
}

