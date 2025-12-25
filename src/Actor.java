import java.util.Objects;

public class Actor extends Person{
    private final double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        if (!(o instanceof Actor actor)) return false;

        return Double.compare(getHeight(), actor.getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight());
    }

}
