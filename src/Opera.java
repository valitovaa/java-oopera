import java.util.ArrayList;

public class Opera extends MusicShow{
    private final int choirSize;

    public Opera(int duration, String title, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(duration, title, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }


    public int getChoirSize() {
        return choirSize;
    }
}
