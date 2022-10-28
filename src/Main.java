import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7f, "жёлтый", 2015, "Россия");
        lada.setTypeOfTransmission("автомат");
        lada.setRegNumber("d125hf234");
        System.out.println(lada.isCorrectRegNumber());
        lada.setSummerTires(false);
        lada.setKey(new Car.Key(true,true));
        lada.setInsurance(new Car.Insurance(LocalDate.now(), 20000, "152563478"));
        lada.getInsurance().checkNumber();
        lada.getInsurance().checkValidityPeriod();
        System.out.println(lada);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия");
        System.out.println(audi);

        Car bmw = new Car("BMW", "Z8", 3.0f, "чёрный", 2021, "Германия");
        System.out.println(bmw);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея");
        System.out.println(kia);

        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");
        System.out.println(hyundai);


        hyundai.refill();
        System.out.println();

        // Объекты класса Train

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
                null, 301,3500, null, "Белорусский вокзал",
                "Минск-Пассажирский", 11 );
        System.out.println(lastochka);

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270, 1700, null, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        System.out.println(leningrad);
        leningrad.refill();
        System.out.println();
        System.out.println();

        // Объекты класса Bus

        Bus paz = new Bus("ПАЗ", "32051", 2011, "Россия","жёлтый", 90);
        System.out.println(paz);

        Bus liaz = new Bus("ЛиАЗ", "677", 2000, "Россия", "белый", 85);
        System.out.println(liaz);

        Bus welly = new Bus("London Bus Welly", "351", 2019, "Англия", "красный",
                120);
        System.out.println(welly);
        welly.refill();
        System.out.println();

        // Объекты класса земноводные
        System.out.println("Класс Земноводные");
        Amphibians frog = new Amphibians("Лягушка", 5, null);
        System.out.println(frog);
        Amphibians grassSnake = new Amphibians("Уж пресноводный", 3, null);
        System.out.println(grassSnake);
        System.out.println(frog.equals(grassSnake));
        System.out.println();

        // Объекты класса млекопитающие, травоядные
        System.out.println("Млекопитающие. Класс Травоядные");
        Herbivores gazelle = new Herbivores("Газель", 8, "степь", 45, null);
        System.out.println(gazelle);
        Herbivores giraffe = new Herbivores("Жираф", 10, null, 0, null);
        System.out.println(giraffe);
        Herbivores horse = new Herbivores("Лошадь", 12, "конюшня", 100, null);
        System.out.println(horse);
        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
        System.out.println(giraffe.equals(horse));
        System.out.println();



        // Объекты класса млекопитающие, хищники
        System.out.println("Млекопитающие. Класс Хищники");
        Predators hyena = new Predators("Гиена", 7, " ", 80, null);
        System.out.println(hyena);
        Predators tiger = new Predators("Тигр", 20, "джунгли", 150, null);
        System.out.println(tiger);
        Predators bear = new Predators("Медведь", 10, "лес", 70, "смешанная");
        System.out.println(bear);
        System.out.println(hyena.equals(tiger));
        System.out.println(hyena.equals(bear));
        System.out.println(tiger.equals(bear));
        System.out.println();

        // Объекты класса птицы, нелетающие
        System.out.println("Птицы нелетающие");
        Notfly peacock = new Notfly("Павлин", 4, "саванна", "не летает");
        System.out.println(peacock);
        Notfly penguin = new Notfly("Пингвин", 6, "побережье Антарктики", "не летает");
        System.out.println(penguin);
        Notfly dodo = new Notfly("Птица Додо", 2, "джунгли", "не летает");
        System.out.println(dodo);
        System.out.println(peacock.equals(penguin));
        System.out.println(peacock.equals(dodo));
        System.out.println(penguin.equals(dodo));
        System.out.println();

        // Объекты класса птицы, летающие
        System.out.println("Птицы летающие");
        Fly seagull = new Fly("Чайка", 3, " ", "летает");
        System.out.println(seagull);
        Fly albatross = new Fly("Альбатрос", 1, " ", "летает");
        System.out.println(albatross);
        Fly falcon = new Fly("Сокол", 5, " ", "летает");
        System.out.println(falcon);
        System.out.println(seagull.equals(albatross));
        System.out.println(seagull.equals(falcon));
        System.out.println(albatross.equals(falcon));
    }
}

