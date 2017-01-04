package HeadFirstJava;

/**
 * Created by Алина on 29.08.2016.
 */
import java.net.*;
import java.io.*;
public class DailyAdviceServer
{
    String[] adviceList={"Ешьте меньшими порциями", "Купите облегающие джинсы. Нет они не делают вас полнее.","Два слова: не годится", "Будьте честны хотябы сегодня", "Скажите своему начальнику все, что вы *на самом деле* о нем думаете.", "Возможно, вам стоит подобрать другую прическу."};

    public void go(){
        try{
            ServerSocket serverSocket=new ServerSocket(4242);
            while (true){
                Socket sock=serverSocket.accept();

                PrintWriter writer=new PrintWriter(sock.getOutputStream());
                String advice=getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex){ex.printStackTrace();}

    }
    private String getAdvice(){
        int random=(int)(Math.random()*adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args){
        DailyAdviceServer server=new DailyAdviceServer();
        server.go();
    }
}
