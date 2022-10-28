import java.util.Objects;

public class Mammals extends Animals {

    private String livingEnvironment;
    private int speed;

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "суша");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 1;
        }
    }

    @Override
    public void eat() {
        System.out.println("Я кушаю!");
    }

    @Override
    public void go() {
        System.out.println("Я перемещаюсь!");
    }
    public void walk() {
        System.out.println("Я гуляю!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }
    @Override
    public String toString() {
        return getName() + ", возраст - " + getAge() + " лет." +
                "Среда обитания - " + livingEnvironment + ". Скорость - " + getSpeed() + " км/ч.";
    }
}
