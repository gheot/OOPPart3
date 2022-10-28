public class Bus  extends transport{

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getProductionYear() +
                " года выпуска, " + " страна сборки - " + getProductionCountry() + ", цвет кузова: " + getColor() +
                ", скорость передвижения " + getMaxSpeed() + " км/ч.";
    }
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");

    }
}

