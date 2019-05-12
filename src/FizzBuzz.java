public class FizzBuzz {
    public static void main(String[] args) {
        fiBu(100);
    }

    public static void fiBu(int x) {
        for (int i = 1; i < x + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }
        }
    }
}