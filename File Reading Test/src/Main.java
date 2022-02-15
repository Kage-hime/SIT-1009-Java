import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {

        /** Two Lists to hold separate values **/
        ArrayList<String> playerlist = new ArrayList<String>();
        ArrayList<Integer> playerScore = new ArrayList<Integer>();

        /** Reading 2 files to populate the lists **/
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
            playerScore.add(filescan.nextInt());
        }

        /** Writing to files to mimic updating of value **/
        FileWriter updatelist = new FileWriter("src\\namelist.txt",true);
        updatelist.write("New Name\n");
        updatelist.close();

        updatelist = new FileWriter("src\\scorelist.txt", true);
        updatelist.write((String.valueOf(50)));
        updatelist.close();




        if(playerlist.size() != playerScore.size())
        {
            filescan.close();
            throw new IllegalArgumentException("Invalid List sizes");
        }

        else
        {
            for(int i = 0 ; i < playerlist.size() ; i++)
                System.out.format(playerlist.get(i) + " %d\n", playerScore.get(i) );

        }

        filescan.close();



    }
}
