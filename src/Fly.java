import java.util.Objects;

public class Fly extends Birds {

    private String typeOfMovement;

    public Fly(String name, int age, String livingEnvironment, String typeOfMovement) {
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
        Fly fly = (Fly) o;
        return Objects.equals(typeOfMovement, fly.typeOfMovement);
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

    public void fly(){
        System.out.println("Я летаю!");
    }

    @Override
    public String toString() {
        return getName() + ", возраст - " + getAge() + " лет." +
                "Среда обитания - " + getLivingEnvironment() + ". Тип передвижения: " + typeOfMovement +
                ". (" + getClass() + ").";
    }
}

