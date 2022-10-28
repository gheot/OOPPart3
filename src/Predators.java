import java.util.Objects;

public class Predators extends Mammals{

    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        setTypeOfFood(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood, "мясная пища");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        super.go();
    }

    public void hunt(){
        System.out.println("Я охочусь!");
    }
    @Override
    public String toString() {
        return getName() + ", возраст - " + getAge() + " лет." +
                "Среда обитания - " + getLivingEnvironment() + ". Скорость - " + getSpeed() + " км/ч." +
                ". Тип пищи: " + typeOfFood + ". (" + getClass() + ").";
    }
}

