public abstract class transport {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private double maxSpeed;

    public transport(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        this.color = ValidationUtils.validOrDefault(color, "белый");;
        setMaxSpeed(maxSpeed);   // проверка на отрицат. значение при помощи сеттера
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "Цвет не задан");
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed > 0.0f) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
    }
    public abstract void refill();   // абстрактный метод
}
