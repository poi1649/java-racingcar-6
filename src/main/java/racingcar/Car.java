package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private static int raceScore = 0;
    private static final int FORWARD_CONSTANT = 4;

    private Car(String name){
        this.name = name;
    }

    private static void forward(){
        if(Randoms.pickNumberInRange(0,9) >= FORWARD_CONSTANT){
            raceScore += 1;
        }
    }
}