package composite;

public class Client {
    public static void main(String[] args) {
        //메인 가방 생성
        Bag bag_main = new Bag("메인 가방");

        // 아이템 인스턴스 생성
        Item armor = new Item("갑옷", 250);
        Item sword = new Item("장검", 500);

        // 메인 가방에 모험에 필요한 무구 아이템 추가
        bag_main.add(armor);
        bag_main.add(sword);

        // 서브 가방 생성
        Bag foodBag = new Bag("음식 가방");
        Bag etcBag = new Bag("잡화 가방");

        //음식 인스턴스
        Item apple = new Item("사과", 350);
        Item banana = new Item("바나나", 200);

        //잡화 인스턴스
        Item shoes = new Item("신발", 300);
        Item phone = new Item("스마트폰", 900);


        // 서브 가방에는 음식 아이템만 추가
        foodBag.add(apple);
        foodBag.add(banana);

        etcBag.add(shoes);
        etcBag.add(phone);
        // 서브 가방을 메인 가방에 넣음
        bag_main.add(foodBag);

        // 가방 구성 끝

        Client client = new Client();

        client.printPrice(bag_main);

        client.printPrice(foodBag);
        client.printPrice(etcBag);

        foodBag.add(etcBag);
        client.printPrice(foodBag);
        client.printPrice(etcBag);

        client.printPrice(bag_main);
    }

    public void printPrice(ItemComponent bag){
            int result = bag.getPrice();
        System.out.println(STR."\{bag.getName()}의 아이템 총합: \{result} 골드");
    }
}
