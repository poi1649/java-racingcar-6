package racingcar;

import java.util.ArrayList;

public class RacingGameManager {
    private static final ArrayList<Car> cars = new ArrayList<>();
    private static int raceCount;
    public static void startRace() {
        carEntry();
        runRace();
        printWinner();
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
            ArrayList<Car> cars = runRaceOneTime();
            Output.printResult(cars);
        }
    }

    public static ArrayList<Car> runRaceOneTime() {
        for(Car car: cars) {
            car.forward();
        }
        return cars;
    }

    public static void printWinner() {
        Output.printWinner(whoIsWinner(cars));
    }

    public static ArrayList<String> whoIsWinner(ArrayList<Car> cars) {
        ArrayList<String> winners = new ArrayList<>();
        int highScore = findHighScore(cars);
        for(Car car: cars) {
            if(car.getRaceScore() == highScore){
                winners.add(car.getName());
            }
        }
        return winners;
    }

    public static int findHighScore(ArrayList<Car> cars) {
        int highScore = 0;
        for(Car car: cars) {
            int score = car.getRaceScore();
            if(score > highScore) {
                highScore = score;
            }
        }
        return highScore;
    }
}
