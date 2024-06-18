package plain;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("numbers.txt");

        int result = fileProcessor.process();
        System.out.println(result);
    }
}
