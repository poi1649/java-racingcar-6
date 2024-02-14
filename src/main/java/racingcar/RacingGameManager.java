package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RacingGameManager {
    private final List<Car> cars = new ArrayList<>();
    private int raceCount;

    public void startRace() {
        registerCar();
        runRace();
        printWinner();
    }

    public void registerCar() {
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
            car.move(pickNumber());
        }
    }

    public int pickNumber() {
        return Randoms.pickNumberInRange(0, 9);
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
