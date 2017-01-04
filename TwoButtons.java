package HeadFirstJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Алина on 11.08.2016.
 */
public class TwoButtons
{
    JFrame frame;
    JLabel label;

    public static void main(String[] args){
        TwoButtons guil=new TwoButtons();
        guil.start();
    }

    public void start(){
        frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton=new JButton("Change label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton=new JButton("Change circle");
        colorButton.addActionListener(new ColorListener());

        label=new JLabel("Uiiiii");
        MyDrawPanel panel=new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.EAST , labelButton);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    class LabelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event){
            label.setText("Ohh!");
        }
    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }
    }
}

class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        g.fillRect(0,0, this.getWidth(), this.getHeight());

        int red=(int) (Math.random()*255);
        int green=(int) (Math.random()*255);
        int blue=(int) (Math.random()*255);

        Color colorRandom=new Color(red,green, blue);
        g.setColor(colorRandom);
        g.fillOval(70,70,200,200);
    }
}