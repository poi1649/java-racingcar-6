package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int raceScore;
    private static final int FORWARD_CONSTANT = 4;

    public Car(String name) {
        this.name = name;
        raceScore = 0;
    }

    public void forward() {
        if(Randoms.pickNumberInRange(0, 9) >= FORWARD_CONSTANT) {
            raceScore += 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getRaceScore() {
        return raceScore;
    }
}