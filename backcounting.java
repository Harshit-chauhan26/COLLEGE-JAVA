public class backcounting {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Counting backwards from " + number + ":");
        countBackwards(number);
    }

    public static void countBackwards(int n) {
        if (n >= 0) {
            // countBackwards(n - 1);
            // System.out.println(n);
            System.out.println(n);
            countBackwards(n - 1);
        }
    }
}
