import java.util.ArrayList;

public class MusicShow extends Show{
    private final MusicAuthor musicAuthor;
    private  final String librettoText;

    public MusicShow(int duration, String title, MusicAuthor musicAuthor, String librettoText) {
        super(duration, title);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibretto(){
        System.out.println(librettoText);
    }
}
