package HeadFirstJava;
import javax.sound.midi.*;
/**
 * Created by Алина on 05.08.2016.
 */
public class MusicTest1
{
    public void play()
    {
        try
        {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq=new Sequence(Sequence.PPQ, 4);
            Track track=seq.createTrack();

            ShortMessage a=new ShortMessage();
           // first.setMessage(192, 1, 102, 0);
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn=new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b=new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff=new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();

            //System.out.println("Мы получили синтезатор!");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            //System.out.println("Неудача!");
        }
    }

    public static void main(String[] args)
    {
        MusicTest1 mn = new MusicTest1();
        mn.play();
    }
}
