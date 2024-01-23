package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class Input {
    private static final int MAX_LENGTH_NAME = 5;

    public static void inputName(){
        String names = Console.readLine();
        splitName(names);
    }

    public static ArrayList<String> splitName(String names){
        ArrayList<String> nameList =  new ArrayList<>(Arrays.asList(names.split(",")));
        checkName(nameList);
        return nameList;
    }

    public static int inputNumber() {
        String number = Console.readLine();
        return Integer.parseInt(number);
    }

    public static void checkName(ArrayList<String> nameList) {
        for(String name: nameList){
            if(name.length() > MAX_LENGTH_NAME) {
                throw new IllegalArgumentException("자동차 이름은 5글자까지 입력 가능합니다.");
            }
        }
    }
}
