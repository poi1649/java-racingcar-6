package racingcar;

import java.util.ArrayList;

public class RacingGameManager {
    private static final ArrayList<Car> cars = new ArrayList<>();
    private static int raceCount;
    private static int maxScore = 0;
    public static void startRace() {
        carEntry();
        runRace();
        printWinner(whoIsWinner(cars));
    }

    public static void carEntry() {
        Output.inputNameMessage();
        ArrayList<String> names = Input.inputName();
        Output.inputNumberMessage();
        raceCount = Input.inputNumber();
        for(String name: names) {
            cars.add(new Car(name));
        }
    }

    public static void runRace() {
        Output.resultMessage();
        for(int i=0; i<raceCount; i++) {
            ArrayList<Car> cars = raceOneTime();
            Output.printResult(cars);
        }

    }

    public static ArrayList<Car> raceOneTime() {
        for(Car car: cars) {
            car.forward();
        }
        return cars;
    }

    public static void printWinner(ArrayList<String> names) {
        Output.printWinner(names);
    }

    public static ArrayList<String> whoIsWinner(ArrayList<Car> cars) {
        ArrayList<String> winners = new ArrayList<>();
        winnerScore(cars);
        for(Car car: cars) {
            if(car.getRaceScore() == maxScore){
                winners.add(car.getName());
            }
        }
        return winners;
    }

    public static void winnerScore(ArrayList<Car> cars) {
        for(Car car: cars) {
            int score = car.getRaceScore();
            if(score > maxScore) {
                maxScore = score;
            }
        }
    }
}