package composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements ItemComponent {
    //아이템과 서브 가방을 저장하기 위한 인터페이스 타입 리스트로 저장
    List<ItemComponent> components = new ArrayList<>();

    String name; //가방 이름

    public Bag(String name) {
        this.name = name;
    }

    public void add(ItemComponent item) {
        components.add(item);
    }

    public List<ItemComponent> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        //리스트의 요소가 item이면 정수, bag이면 재귀 함수 동작(한 칸 아래 가방으로 이동)
        int sum = 0;

        for (ItemComponent comp : components) {
            sum += comp.getPrice();
        }
        return sum;
    }

    @Override
    public String getName() {
        return name;
    }
}
