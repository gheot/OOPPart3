import java.util.Objects;

public abstract class Animals {

    private final String name;
    private final int age;

    public Animals(String name, int age) {
        this.name = ValidationUtils.validOrDefault(name, "false");
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public abstract void eat();

    public abstract void go();

    public void sleep() {
        System.out.println("Я сплю!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



