package HeadFirstJava;

/**
 * Created by CyberNiggaXX87 on 25.02.2016.
 */
public class OutputTestDrive
{
    public static void main(String[] args)
    {

        OutputTestDrive go = new OutputTestDrive();
        go.boo();
    }

        void boo(){
            int y=7;
    for (int x=1; x<8; x++){
       y++;
        if (x>4){
            System.out.print(++y + " ");
        }
        if (y>14){
            System.out.println("x= "+x);
            break;
        }

    }
        }
    }

