package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class RacingTest {
    @Test
    void 자동차_등록_테스트(){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        Car firstCar = cars.get(0);
        assertThat(firstCar.getName()).isEqualTo("test");
    }

    @Test
    void 경주_진행시_자동차_이동_테스트(){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        Car firstCar = cars.get(0);
        firstCar.forward();
        assertThat(firstCar.getRaceScore()).isEqualTo(1);
    }

    @Test
    void 우승자_선정_결과_테스트(){
        ArrayList<Car> cars = new ArrayList<>();
        for(int i=0; i<10; i++){
            cars.add(new Car("car"+i));
            cars.get(0).forward();
        }
        ArrayList<String> winners = RacingGameManager.whoIsWinner(cars);
        assertThat(winners.size()).isEqualTo(1);
    }
}
