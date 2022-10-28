public class Train extends transport{

    private double priceOfTrip;
    private String timeOfTrip;
    private String departureStation;
    private String finalStation;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed,
                 double priceOfTrip, String timeOfTrip, String departureStation, String finalStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        setPriceOfTrip(priceOfTrip);
        setTimeOfTrip(timeOfTrip);
        setDepartureStation(departureStation);
        setFinalStation(finalStation);
        setNumberOfWagons(numberOfWagons);
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        if (priceOfTrip > 0) {
            this.priceOfTrip = priceOfTrip;
        } else {
            this.priceOfTrip = 0;
        }
    }

    public String getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(String timeOfTrip) {
        this.timeOfTrip = ValidationUtils.validOrDefault(timeOfTrip, "00:00");
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = ValidationUtils.validOrDefault(departureStation, "Станция отбытия не указана");
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = ValidationUtils.validOrDefault(finalStation, "Конечная остановка не указана");
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons > 0) {
            this.numberOfWagons = numberOfWagons;
        } else {
            this.numberOfWagons = 0;
        }
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getProductionYear() +
                " года выпуска, " + " страна сборки - " + getProductionCountry() + ", скорость передвижения " + getMaxSpeed() +
                " км/ч, станция отправления: " + getDepartureStation() + ", следует до станции: " + getFinalStation() +
                ". Цена поездки - " + getPriceOfTrip() + " рублей, в поезде " + getNumberOfWagons() + " вагонов.";
    }
    public void refill() {
        System.out.println("Нужно заправлять дизелем.");

    }
}
