import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        //привет, ревьюер)

        Actor Will = new Actor("Noah", "Schnapp",Gender.MALE, 1.74);
        Actor El = new Actor("Mille Bobby", "Brown", Gender.FEMALE,1.61);
        Actor Joyce = new Actor("Winona", "Ryder",Gender.FEMALE,1.61);

        Director Matt = new Director("Matt", "Duffer",Gender.MALE, 5);
        Director Ross = new Director("Ross", "Duffer", Gender.MALE,5);

        MusicAuthor Kyle = new MusicAuthor("Kyle", "Dixon", Gender.MALE);

        Choreographer Diane = new Choreographer("Diane","Grey", Gender.FEMALE);


        Show chapterOne = new Show(49,"Chapter One: The Vanishing of Will Byers");

        Opera chapterTwo = new Opera(50,"Chapter Two: The Weirdo on Maple Street", Kyle,"Omg she's  so weird, why is she bald?", 20);

        Ballet chapterThree = new Ballet(50,"Chapter Three: Holly, Jolly",
                Kyle,"Use the Christmas lights to speak",Diane);

        chapterOne.addNewActor(Will);
        chapterOne.addNewActor(Joyce);

        chapterTwo.addNewActor(El);
        chapterTwo.addNewActor(Will);

        chapterThree.addNewActor(Will);
        chapterThree.addNewActor(El);

        chapterOne.printListOfActors();
        chapterTwo.printListOfActors();
        chapterThree.printListOfActors();

        chapterThree.changeActor(Will,Joyce);
        chapterThree.printListOfActors();

    }
}
