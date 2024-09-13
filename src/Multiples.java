public class Multiples {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        System.out.println(count);

    }

}


// We're looking for non-negative multiples of 3 or 5. The first four are 3, 5, 6, and 9, so there are four below 10.
// How many are below 1000?
