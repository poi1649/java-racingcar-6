package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class Input {
    private static final int MAX_NAME_LENGTH = 5;

    private Input() {

    }

    public static List<String> readName() {
        String names = Console.readLine();
        return splitName(names);
    }

    public static List<String> splitName(String names) {
        List<String> splitNames = Arrays.asList(names.split(","));
        checkName(splitNames);
        return splitNames;
    }

    public static void checkName(List<String> names) {
        for (String name : names) {
            if (name.length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException("자동차 이름은 5글자까지 입력 가능합니다.");
            }
        }
    }

    public static int readNumber() {
        String number = Console.readLine();
        checkNumber(number);
        return Integer.parseInt(number);
    }

    public static void checkNumber(String number) {
        if (!isNumber(number)) {
            throw new IllegalArgumentException("숫자를 입력해 주세요.");
        }
        if (Integer.parseInt(number) <= 0) {
            throw new IllegalArgumentException("1 이상의 수를 입력해 주세요.");
        }
    }

    public static boolean isNumber(String number) {
        return number.chars().allMatch(Character::isDigit);
    }
}
