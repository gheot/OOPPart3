import java.util.Objects;

public class Notfly extends Birds {

    private String typeOfMovement;

    public Notfly(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        setTypeOfMovement(typeOfMovement);
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = ValidationUtils.validOrDefault(typeOfMovement, "не определён");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Notfly notfly = (Notfly) o;
        return Objects.equals(typeOfMovement, notfly.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    public void walk() {
        System.out.println("Я гуляю!");
    }

    @Override
    public String toString() {
        return getName() + ", возраст - " + getAge() + " лет." +
                "Среда обитания - " + getLivingEnvironment() + ". Тип передвижения: " + typeOfMovement +
                ". (" + getClass() + ").";
    }
}