package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int FORWARD_THRESHOLD = 4;
    private final String name;
    private int distance;

    public Car(String name) {
        this.name = name;
        distance = 0;
    }

    public void move(int number) {
        if (number >= FORWARD_THRESHOLD) {
            distance += 1;
        }
    }

    public int pickNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public boolean isWinner(int highScore) {
        return this.distance == highScore;
    }

    public String getName() {
        return name;
    }

    public int getMoveDistance() {
        return distance;
    }
}
