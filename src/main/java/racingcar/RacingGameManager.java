package racingcar;

import java.util.ArrayList;

public class RacingGameManager {
    private static ArrayList<Car> cars = new ArrayList<>();
    private static int raceCount;
    public static void startRace(){
        carEntry();
    }

    public static void carEntry(){
        ArrayList<String> names = Input.inputName();
        raceCount = Input.inputNumber();
        for(String name: names){
            cars.add(new Car(name));
        }
    }
}