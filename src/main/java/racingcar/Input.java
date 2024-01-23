package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class Input {
    public void inputName(){
        String names = Console.readLine();
        splitName(names);
    }

    public static ArrayList<String> splitName(String names){
        return new ArrayList<>(Arrays.asList(names.split(",")));
    }

    public static int inputNumber() {
        String number = Console.readLine();
        return Integer.parseInt(number);
    }
}