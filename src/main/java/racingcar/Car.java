package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int distance;
    private static final int FORWARD_THRESHOLD = 4;

    public Car(String name) {
        this.name = name;
        distance = 0;
    }

    public void move() {
        if (Randoms.pickNumberInRange(0, 9) >= FORWARD_THRESHOLD) {
            distance += 1;
        }
    }

    public boolean isWinner(int highScore){
        return this.distance == highScore;
    }

    public String getName() {
        return name;
    }

    public int getMoveDistance() {
        return distance;
    }
}
