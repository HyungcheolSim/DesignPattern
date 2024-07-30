package strategy.legacy;

public class Owner {
    public static void main(String[] args) {
        Robot robot1 = new WalkingRobot();
        robot1.display();
        robot1.move();

        Robot robot2 = new RunningRobot();
        robot2.display();
        robot2.move();
    }
}
