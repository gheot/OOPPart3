import java.util.Objects;

public class Amphibians extends Animals{

    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "вода");
    }

    @Override
    public void eat() {
        System.out.println("Я кушаю!");
    }

    @Override
    public void go() {
        System.out.println("Я перемещаюсь!");
    }
    public void hunt(){
        System.out.println("Я охочусь!");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return getName() + ", возраст - " + getAge() + " лет." +
                "Среда обитания - " + livingEnvironment + ". (" + getClass() + ").";
    }
}