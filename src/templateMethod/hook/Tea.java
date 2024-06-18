package templateMethod.hook;


class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("차를 우리는 중");
    }

    public void addCondiments() {}
}