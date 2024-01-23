package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class Input {
    public void inputName(){
        String inputNames = Console.readLine();
        splitName(inputNames);
    }

    public static ArrayList<String> splitName(String names){
        return new ArrayList<>(Arrays.asList(names.split(",")));
    }
}