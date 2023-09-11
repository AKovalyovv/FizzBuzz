public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int step = 0;

        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
            }
            else
                i -= 1;
            step += 1;
        }

        System.out.println(step);
    }
}
