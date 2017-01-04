package HeadFirstJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by Алина on 10.08.2016.
 */
public class SimpleGuilB implements ActionListener
{
    JButton button;

    public static void main(String[] args){
        SimpleGuilB gui=new SimpleGuilB();
        gui.go();
    }

    public void go(){
        JFrame frame =new JFrame();

       // graphics.fillOval(70,70,100,100);
       button=new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(BorderLayout.WEST, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
  public void  paintComponent(){
    //  graphics.fillOval(70,70,100,100);
    }

    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked!");
    }
}
