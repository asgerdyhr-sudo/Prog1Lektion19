package opgave03.model;

import java.util.ArrayList;

public class Rental {
    private int number;
    private int days;
    private String date;
    private final ArrayList<Car> cars = new ArrayList<>();

    public Rental(int number, String date, int days) {
        this.number = number;
        this.days = days;
        this.date = date;
    }

    public void printRentetCars (){
        for (Car car : cars) {
            System.out.println("| Car licence: " + car.getLicense() +
                    " | Year: " + car.getPurchaseYear() +
                    " | Order Nr: " + number +
                    " | Order date: " + date +
                    " | How many days: " + getDays() +
                    " | Price: " + getPrice());
        }
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<Car>(cars);
    }

    public void addCar (Car car){
        cars.add(car);
    }

    public void removeCar (Car car){
        if (cars.contains(car)){
            cars.remove(car);
        }
    }

    //Mangler
    public double getPrice(){
        double price = 0;
        for (Car car : cars) {
            price += car.getPricePerDay();
        }
        return price * getDays();
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
