public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 10 };
        boolean[] present = new boolean[11];

        // Mark numbers that are present
        for (int num : arr) {
            present[num] = true;
        }

        // Find missing numbers
        System.out.println("Missing numbers:");

        for (int i = 1; i <= 10; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }

}
