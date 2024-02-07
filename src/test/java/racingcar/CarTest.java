package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {
    private static final int FORWARD_THRESHOLD = 4;

    @Test
    void carMoveTest() {
        Car testCar = new Car("test");
        testCar.move(FORWARD_THRESHOLD);
        assertThat(testCar.getMoveDistance()).isEqualTo(1);
    }
}
