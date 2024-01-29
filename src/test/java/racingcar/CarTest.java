package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void carMoveTest() {
        Car testCar = new Car("test");
        while (testCar.getMoveDistance() < 1) {
            testCar.move();
        }
        assertThat(testCar.getMoveDistance()).isGreaterThan(0);
    }
}
