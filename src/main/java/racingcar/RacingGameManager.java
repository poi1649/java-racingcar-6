package racingcar;

import java.util.ArrayList;

public class RacingGameManager {
    private static final ArrayList<Car> cars = new ArrayList<>();
    private static int raceCount;

    public static void startRace() {
        entryCar();
        runRace();
        printWinner();
    }

    public static void entryCar() {
        Output.inputNameMessage();
        ArrayList<String> names = Input.readName();
        Output.inputNumberMessage();
        raceCount = Input.readNumber();
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public static void runRace() {
        Output.resultMessage();
        for (int i = 0; i < raceCount; i++) {
            ArrayList<Car> cars = runRaceOneTime();
            Output.result(cars);
        }
    }

    public static ArrayList<Car> runRaceOneTime() {
        for (Car car : cars) {
            car.move();
        }
        return cars;
    }

    public static void printWinner() {
        Output.winner(findWinner(cars));
    }

    public static ArrayList<String> findWinner(ArrayList<Car> cars) {
        ArrayList<String> winners = new ArrayList<>();
        int highScore = findHighScore(cars);
        for (Car car : cars) {
            if (car.isWinner(highScore)) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    public static int findHighScore(ArrayList<Car> cars) {
        int highScore = 0;
        for (Car car : cars) {
            int score = car.getMoveDistance();
            if (score > highScore) {
                highScore = score;
            }
        }
        return highScore;
    }
}
