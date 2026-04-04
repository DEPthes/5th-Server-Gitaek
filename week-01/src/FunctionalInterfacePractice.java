public class FunctionalInterfacePractice {
    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y;
        int result = add.calculate(2, 3);
        System.out.println("2 + 3 = " + result);
    }

    @FunctionalInterface
    interface Calculator {
        int calculate(int x, int y);
    }
}
