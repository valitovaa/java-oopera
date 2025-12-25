public class MusicAuthor extends Person{
    //тут конечно нет особого функционала, для которого нужен отдельный класс.
    //Но я подумала, что так лучше, с точки зрения solid

    public MusicAuthor(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }
}
