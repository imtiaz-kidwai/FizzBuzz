public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int counter = 0;
        while (i > 0) {
            boolean even = i % 2 == 0;
            boolean odd = i % 2 == 1;

            if (even) {
                i = i/2;
                counter  = counter + 1;
            } else if (odd) {
                i = i - 1;
                counter = counter + 1;
            }

        }
        System.out.println(counter);
    }
}
