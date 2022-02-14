import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> playerlist = new ArrayList<String>();
        ArrayList<Float> playerScore = new ArrayList<Float>();

        File file = new File("src\\namelist.txt");
        Scanner filescan = new Scanner(file);

        while(filescan.hasNextLine())
        {
            playerlist.add(filescan.nextLine());
        }

        file = new File("src\\scorelist.txt");
        filescan = new Scanner(file);

        while(filescan.hasNextLine())
        {
            playerScore.add(filescan.nextFloat());
        }

        if(playerlist.size() != playerScore.size())
        {
            filescan.close();
            throw new IllegalArgumentException();
        }

        else
        {
            for(int i = 0 ; i < playerlist.size() ; i++)
                System.out.format(playerlist.get(i) + " %.0f\n", playerScore.get(i) );

        }

        filescan.close();


    }
}
