package HeadFirstJava;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Алина on 11.08.2016.
 */
public class MiniMusicPlayer1 implements ControllerEventListener {
    static JFrame frame=new JFrame("Мой первый музыкальный клип");
static MyDrawPanel panel;


    public static void main(String[] args)
    {
        MiniMusicPlayer1 mini = new MiniMusicPlayer1();
        mini.go();
    }

    public void go() {

        try {
            Sequencer sequencer= MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant={127};
            sequencer.addControllerEventListener(this, eventsIWant);

            Sequence seq=new Sequence(Sequence.PPQ, 4);
            Track track=seq.createTrack();

            for (int i=5; i<121; i+=4){
                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,i,100,i+4));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch(Exception ex) {ex.printStackTrace();}

    }

    public void controlChange(ShortMessage event) {
        System.out.println("La");
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
        MidiEvent event=null;
        try
        {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {}
        return event;
    }

    public class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg=false;

        public void controlChange(ShortMessage event) {
            msg=true;
            repaint();
        }

        public void paintComponent(Graphics g){
            Graphics2D g2d=(Graphics2D) g;
            int red=(int) (Math.random()*250);
            int green=(int) (Math.random()*250);
            int blue=(int) (Math.random()*250);

            g.setColor(new Color(red, green, blue));

            int ht=(int) (Math.random()*120)+10;
            int weidth=(int) (Math.random()*120)+10;
            int x=(int) (Math.random()*40)+10;
            int y=(int) (Math.random()*40)+10;

            g.fillRect(x, y, ht, weidth);
            msg=false;
        }
    }

}
