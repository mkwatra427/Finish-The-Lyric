import java.io.FileNotFoundException;

/**
 * Created by Mitran Kwatra on 5/20/2019.
 */
public class Autorun {

    private static String lyricSource;

    public static void main(String[] args) throws FileNotFoundException {

        lyricSource = "lyricSource.txt";
        LyricSet lyrics = FileReader.getLyricSet(lyricSource);
        for(String[] lyric : lyrics.lyrics) {
            System.out.println(lyric[0]);
            System.out.println(lyric[1]);
        }

    }

}
