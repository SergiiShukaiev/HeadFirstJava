package HeadFirstJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Алина on 11.08.2016.
 */
public class InnerButton
{
    JFrame frame;
    JButton b;

    public static void main(String[] args) {
        InnerButton gui=new InnerButton();
        gui.go();
    }

    public void go(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b=new JButton("A");
        b.addActionListener(new Blistener());

        frame.getContentPane().add(BorderLayout.SOUTH, b);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    public class Blistener implements ActionListener
    {
        public void actionPerformed(ActionEvent event) {
            if (b.getText().equals("A")) b.setText("B");
            else b.setText("A");
        }
    }
}
