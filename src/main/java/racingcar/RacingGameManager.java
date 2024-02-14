package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RacingGameManager {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;
    private final List<Car> cars = new ArrayList<>();
    private int raceCount;

    public void startRace() {
        registersCar();
        runRace();
        printWinner();
    }

    public void registersCar() {
        Output.inputNameMessage();
        List<String> names = Input.readName();
        Output.inputNumberMessage();
        raceCount = Input.readNumber();
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public void runRace() {
        Output.resultMessage();
        for (int i = 0; i < raceCount; i++) {
            runRaceOneTime();
            Output.showResult(cars);
        }
    }

    public void runRaceOneTime() {
        for (Car car : cars) {
            car.move(pickRandomNumber());
        }
    }

    public int pickRandomNumber() {
        return Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
    }

    public void printWinner() {
        Output.showWinner(findWinner(cars));
    }

    public ArrayList<String> findWinner(List<Car> cars) {
        ArrayList<String> winners = new ArrayList<>();
        int highScore = findHighScore(cars);
        for (Car car : cars) {
            if (car.isWinner(highScore)) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    private int findHighScore(List<Car> cars) {
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
