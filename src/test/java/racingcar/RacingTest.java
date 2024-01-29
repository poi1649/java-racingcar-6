package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class RacingTest {
    @Test
    void 자동차_등록_테스트() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        Car firstCar = cars.get(0);
        assertThat(firstCar.getName()).isEqualTo("test");
    }

    @Test
    void 경주_진행시_자동차_이동_테스트() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("test"));
        Car firstCar = cars.get(0);
        for(int i=0; i<10; i++) {
            firstCar.move();
        }
        assertThat(firstCar.getMoveDistance()).isNotEqualTo(0);
    }

    @Test
    void 우승자_선정_결과_테스트() {
        ArrayList<Car> cars = new ArrayList<>();
        for(int i=0; i<10; i++) {
            cars.add(new Car("car"+i));
            cars.get(0).move();
        }
        ArrayList<String> winners = RacingGameManager.findWinner(cars);
        assertThat(winners.size()).isEqualTo(1);
    }
}
