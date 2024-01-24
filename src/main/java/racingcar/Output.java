package racingcar;

import java.util.ArrayList;

public class Output {
    public static void inputNameMessage(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void inputNumberMessage(){
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void resultMessage(){
        System.out.println("\n실행 결과");
    }

    public static void printResult(ArrayList<Car> cars){
        for(Car car: cars){
            printProgress(car);
        }
        System.out.print("\n");
    }

    public static void printProgress(Car car){
        String name = car.getName();
        int number = car.getRaceScore();
        System.out.printf("%s : ",name);
        for(int i=0; i<number; i++){
            System.out.print("-");
        }
        System.out.print("\n");
    }

    public static void printWinner(ArrayList<String> names){
        int winnerCount = 1;
        System.out.print("최종 우승자 : ");
        for (String name : names) {
            if (winnerCount > 1) {
                System.out.print(", ");
            }
            winnerCount += 1;
            System.out.print(name);
        }
    }
}
