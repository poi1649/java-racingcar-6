package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class InputTest {

    @Test
    void 자동차_이름_분할_테스트(){
        String names = "ura,zara";
        ArrayList<String> result = Input.splitName(names);
        assertThat(result).contains("zara","ura");
        assertThat(result).containsExactly("ura","zara");
    }
}