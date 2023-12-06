package seminar_3.lesson3;

import java.awt.*;

public class Program {


    public static void main(String[] args) {
        Car car1 = new Harvester("Ford", "Harvester1", Color.BLUE);
        Car car2 = SportCar.create("Chevrolet", "Sport1", Color.RED, 4);
        Car car3 = SportCar.create("Ferrari", "Sport2", Color.YELLOW, 4);
        RefuelingStation refuelingStation = new RefuelingStation();
        RefuelingStationV2 refuelingStationV2 = new RefuelingStationV2();
        Wiping carWash = new CarWash();
        Refueling serviceStation = new ServiceStation();
        car1.setRefuelingStation(refuelingStation);
        car1.fuel();
        
        car1.setRefuelingStation(serviceStation);
        car1.fuel();
        carWash.wipMirrors();
        carWash.wipWindshield();
        carWash.wipHeadlights();

        car2.setRefuelingStation(serviceStation);
        car2.fuel();
        carWash.wipMirrors();
        carWash.wipWindshield();
        carWash.wipHeadlights();

        car3.setRefuelingStation(serviceStation);
        car3.fuel();
        carWash.wipMirrors();
        carWash.wipWindshield();
        carWash.wipHeadlights();


    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500 * 6;
        }
        else {
            return 1000 * 4;
        }
    }

}
