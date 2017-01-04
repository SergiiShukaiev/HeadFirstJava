package HeadFirstJava;

import javax.sound.midi.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алина on 08.08.2016.
 */
public class MiniMusicCmdLine
{
    public static void main(String[] args) throws IOException
    {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int instrument = Integer.parseInt(reader.readLine());
        int note = Integer.parseInt(reader.readLine());
            mini.play(instrument, note);

    }

    public void play(int instrument, int note)
    {
        try
        {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 20);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
