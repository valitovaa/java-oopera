import java.util.ArrayList;

public class Ballet extends MusicShow{
    private final Choreographer choreographer;

    public Ballet(int duration, String title, MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(duration, title, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }


    public Person getChoreographer() {
        return choreographer;
    }
}
