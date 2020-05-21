import java.io.FileNotFoundException;
import java.util.LinkedList;

/**
 * Created by Mitran Kwatra on 5/20/2019.
 */
public class Autorun {

    private static String lyricSource;

    public static void main(String[] args) throws FileNotFoundException {

        lyricSource = "lyricSource.txt";
        /*
        LinkedList<String> lyrics = FileReader.getLyricSet(lyricSource);
        for(String lyric : lyrics) {
            System.out.println(lyric);
        }
        */
        String[] results = FileReader.drawLyricPair(lyricSource);
        System.out.println(results[0]);
        System.out.println(results[1]);

    }

}
