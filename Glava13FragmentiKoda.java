package HeadFirstJava;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Алина on 22.08.2016.
 */
public class Glava13FragmentiKoda
{
    public static void main(String[] args){
       /* JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button=new JButton("tesuji");
        JButton buttonTwo=new JButton("watari");
        panel.add(button);
        frame.getContentPane().add(BorderLayout.NORTH, buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST, panel); */

      /*  JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button=new JButton("tesuji");
        JButton buttonTwo=new JButton("watari");
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.getContentPane().add(BorderLayout.EAST, panel); */

      /*  JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button=new JButton("tesuji");
        JButton buttonTwo=new JButton("watari");
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button); */

      /*  JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button=new JButton("tesuji");
        JButton buttonTwo=new JButton("watari");
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button); */

        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button=new JButton("tesuji");
        JButton buttonTwo=new JButton("watari");
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.NORTH, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
