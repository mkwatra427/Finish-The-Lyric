import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Mitran Kwatra on 5/20/2019.
 */
public class FileReader {

    public static LyricSet getLyricSet(String fileName) throws FileNotFoundException {

        LinkedList<String> lyrics = new LinkedList<String>();
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNextLine()) {
            lyrics.add(sc.nextLine());
        }

        return LyricSet.parseLyrics(lyrics);

    }

}
