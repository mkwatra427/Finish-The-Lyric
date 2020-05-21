import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Mitran Kwatra on 5/20/2019.
 */
public class FileReader {

    public static LinkedList<String> getLyricSet(String fileName) throws FileNotFoundException {

        LinkedList<String> lyrics = new LinkedList<String>();
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNextLine()) {
            lyrics.add(sc.nextLine());
        }

        return lyrics;

    }

    public static String[] drawLyricPair(String lyricSource) throws FileNotFoundException {

        LinkedList<String> lyrics = getLyricSet(lyricSource);
        String[] results = new String[2];
        int line2 = (int)(Math.random() * (lyrics.size()));
        results[0] = lyrics.get(line2 - 1);
        results[1] = lyrics.get(line2);
        return results;

    }

}
