package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RacingGameManager {
    private static final ArrayList<Car> cars = new ArrayList<>();
    private static int raceCount;

    public static void startRace() {
        registerCar();
        runRace();
        printWinner();
    }

    public static void registerCar() {
        Output.inputNameMessage();
        List<String> names = Input.readName();
        Output.inputNumberMessage();
        raceCount = Input.readNumber();
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public static void runRace() {
        Output.resultMessage();
        for (int i = 0; i < raceCount; i++) {
            runRaceOneTime();
            Output.showResult(cars);
        }
    }

    public static void runRaceOneTime() {
        for (Car car : cars) {
            car.move(pickNumber());
        }
    }

    public static int pickNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public static void printWinner() {
        Output.showWinner(findWinner(cars));
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

    private static int findHighScore(ArrayList<Car> cars) {
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
