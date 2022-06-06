package CarFactory;

import java.util.*;


public class CarList  {
    static Car.Builder cars = new Car.Builder();
    static List<Car>carList;

    public static List<Car> getCarList(List<Car>carList){
        Car boxer = cars.brand(Car.Brand.PORSCHE).color(Car.Color.BLACK).types(Car.Types.BOXER).year("1997").build();
        Car mustang = cars.brand(Car.Brand.FORD).color(Car.Color.BLACK).types(Car.Types.MUSTANG).year("1967").build();
        Car carreragt = cars.brand(Car.Brand.PORSCHE).color(Car.Color.WHITE).types(Car.Types.CARERRAGT).year("2002").build();
        Car fiestars = cars.brand(Car.Brand.FORD).color(Car.Color.RED).types(Car.Types.FIESTARS).year("2017").build();
        Car focus = cars.brand(Car.Brand.FORD).color(Car.Color.BLUE).types(Car.Types.FOCUS).year("1999").build();
        Car mondeo = cars.brand(Car.Brand.FORD).color(Car.Color.GREEN).types(Car.Types.MONDEO).year("2009").build();
        Car enzo = cars.brand(Car.Brand.FERRARI).color(Car.Color.RED).types(Car.Types.ENZO).year("2002").build();
        Car fforty = cars.brand(Car.Brand.FERRARI).color(Car.Color.RED).types(Car.Types.F40).year("1992").build();
        carList.add(boxer);
        carList.add(carreragt);
        carList.add(fiestars);
        carList.add(focus);
        carList.add(mondeo);
        carList.add(enzo);
        carList.add(fforty);
        carList.add(mustang);

        for(Car o:carList){
            System.out.println("Brand: " + o.getBrand() + " Color:" + o.getColor() + " Type: " +o.getTypes() +" YEAR" + o.getYear());

        }


        return carList;
    }


    public static void main(String[] args) {
        List<Car>carList = new ArrayList<>();
        getCarList(carList);





    }
}

