/**
 * @author Varshini
 * @version 17.0.1
 */

class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    /**
     * Instance variables ^^^
     * @param make - make of the car
     * @param model - model of the car
     * @param year - manufacured year of car
     * @param price - price of car 
     */

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    /**
     * @return - returns make of car
     */
    public String getMake(){
        return make;
    }
    /**
     * @return - returns model of car
     */
    public String getModel(){
        return model;
    }
    /**
     * @return - returns manufacture year of car
     */
    public int getYear(){
        return year;
    }
    /**
     * @return - returns price of car
     */
    public double getPrice(){
        return price;
    }
    /**
     * Updates make of car
     * @param make - new make of car
     */
    public void setMake(String make) {
        this.make = make;
    }
    /**
     * Updates model of car
     * @param model - new model of car
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * Updates manufacture year of car
     * @param year - new  manufacture year of car
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * Updates price of car
     * @param price - new price of car
     */
    public void setPrice(double price) {
        this.price = price;
    }
}