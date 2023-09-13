public class Multiples {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleby5 = i % 5 == 0;
            boolean divisibleby3 = i % 3 == 0;

            if (divisibleby5 || divisibleby3) {
                j = j + 1;
            }

        }
        System.out.println(j);
    }
}
