package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Output {
    private Output() {

    }

    public static void inputNameMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void inputNumberMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void resultMessage() {
        System.out.println("\n실행 결과");
    }

    public static void showResult(List<Car> cars) {
        for (Car car : cars) {
            showProgress(car);
        }
        System.out.print("\n");
    }

    public static void showProgress(Car car) {
        String name = car.getName();
        int number = car.getMoveDistance();
        System.out.printf("%s : ", name);
        for (int i = 0; i < number; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }

    public static void showWinner(ArrayList<String> names) {
        System.out.print("최종 우승자 : ");
        System.out.println(String.join(", ", names));
    }
}
