package HeadFirstJava;

/**
 * Created by Алина on 29.08.2016.
 */
import javax.swing.*;
import java.awt.*;
import java.net.*;
import  java.awt.event.*;
import java.io.*;

public class SimpleChatClientA
{
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public void go(){
        JFrame frame=new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel=new JPanel();
        incoming=new JTextArea(15,50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller=new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing=new JTextField(20);
        JButton sendButton=new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();

        Thread readerThread=new Thread(new IncomingReader());

        frame.setSize(400,500);
        frame.setVisible(true);
    }

    public void setUpNetworking(){
        try{
            sock=new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader=new InputStreamReader(sock.getInputStream());
            reader=new BufferedReader(streamReader);
            writer=new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        } catch (IOException ex) {ex.printStackTrace();}
    }

    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev){
            try{
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {ex.printStackTrace();}

            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public class IncomingReader implements Runnable{
        public void run(){
            String message;
            try{
                while((message=reader.readLine()) !=null){
                    System.out.println("read "+message);
                    incoming.append(message+"\n");
                }
            } catch (Exception ex) {ex.printStackTrace();}
        }
    }

    public static void main(String[] args){

        SimpleChatClientA client=new SimpleChatClientA();
        client.go();
    }
}