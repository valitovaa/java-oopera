import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final ArrayList<Actor> listOfActors;

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }


    public Show(int duration, String title) {
        this.duration = duration;
        this.title = title;
        this.listOfActors = new ArrayList<>();

    }

    public void printListOfActors(){
        System.out.println(title + ":"+'\'');
        for (Actor actor : listOfActors){
            System.out.println(actor);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void addNewActor(Actor newActor){
        for (Actor actor : listOfActors){
            if(actor.equals(newActor)){
                System.out.println("He is already in the show");
                return;
            }

        }
        listOfActors.add(newActor);
    }

    public void changeActor(Actor oldActor, Actor newActor){
        for (Actor actor : listOfActors){
            if(actor.equals(oldActor)){
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                return;
            }
        }
        System.out.println("There is no such actor in the cast");
    }
}
