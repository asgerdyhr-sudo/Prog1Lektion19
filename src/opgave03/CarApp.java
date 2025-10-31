package opgave03;

import opgave03.model.Car;
import opgave03.model.Rental;

public class CarApp {
    public static void main(String[] args) {
        Rental rental1 = new Rental(1,"31/10/2016",7);
        Rental rental2 = new Rental(55,"21/06/2017",10);


        Car audiQ8 = new Car("AB34500",2016);
        audiQ8.setPricePerDay(550.45);
        Car bMWM3 = new Car("QQ98900",2020);
        bMWM3.setPricePerDay(350.49);
        Car vWPassat = new Car("JK66609",2022);
        vWPassat.setPricePerDay(150);
        Car skodaOktavia = new Car("DQ53016",2000);
        skodaOktavia.setPricePerDay(100);
        Car ferraiF85 = new Car("LF84820",1975);
        ferraiF85.setPricePerDay(1500.50);

        rental1.addCar(audiQ8);
        rental1.addCar(bMWM3);

        rental2.addCar(skodaOktavia);
        rental2.addCar(ferraiF85);

        rental1.printRentetCars();
        rental2.printRentetCars();
    }
}
