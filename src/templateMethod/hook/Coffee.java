package templateMethod.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("필터를 통해 커피를 우려내는 중");
    }

    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    boolean customerWantsCondiments() {
        String answer = "";

        System.out.print("커피에 우유와 설탕을 넣어 드릴까요? (y/n) : ");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO 오류");
        }

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
}
