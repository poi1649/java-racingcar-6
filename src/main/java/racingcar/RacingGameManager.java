package racingcar;

import java.util.ArrayList;

public class RacingGameManager {
    private static ArrayList<Car> cars = new ArrayList<>();
    private static int raceCount;
    public static void startRace(){
        carEntry();
        runRace();
    }

    public static void carEntry(){
        ArrayList<String> names = Input.inputName();
        raceCount = Input.inputNumber();
        for(String name: names){
            cars.add(new Car(name));
        }
    }

    public static void runRace(){
        for(int i=0; i<raceCount; i++){
            ArrayList<Car> cars = raceOneTime();
        }
    }

    public static ArrayList<Car> raceOneTime(){
        for(Car car: cars){
            car.forward();
        }
        return cars;
    }
}