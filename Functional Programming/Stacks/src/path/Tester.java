package path;

public class Tester {
    public static void main(String[] args) {
        Long[] numbers = {1l, 2l, 3l, 5l, 6l, 9l};
        NumberPath np = null;
        for (int i = numbers.length-1; i > -1; i--) {
            np = new NumberPath(numbers[i], np);
        }
        System.out.println(np.toString());
    }
}
