
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

    Splash() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

     //   JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
    //    heading.setBounds(80, 200, 1200, 60);
      //  heading.setFont(new Font("Aptos Display", Font.PLAIN, 60));
        //heading.setForeground(Color.BLACK);
       // add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/mm1.png"));
        Image i2 = i1.getImage().getScaledInstance(1100, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 600);
        add(image);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(850, 540, 230, 45);
        clickhere.setBackground(Color.WHITE);
        clickhere.setForeground(Color.BLACK);
        clickhere.addActionListener(this);
        image.add(clickhere);


        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);

        while(true) {
           // heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){

            }

            //heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){

            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String args[]) {
        new Splash();
    }
}