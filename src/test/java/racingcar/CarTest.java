package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CarTest {
    private static final int MOVE_FORWARD = 4;

    @Test
    void carMoveTest() {
        Car testCar = new Car("test");
        while (testCar.getMoveDistance() < 1) {
            testCar.move();
        }
        assertThat(testCar.getMoveDistance()).isGreaterThan(0);
    }
}
