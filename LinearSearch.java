public class LinearSearch {
    static void linear(int n[], int target) {
        boolean found = false; // flag to check if target exists
        for (int i = 0; i < n.length; i++) {
            if (n[i] == target) {
                System.out.println("Target " + target + " found at index " + i);
                found = true;
                break; // stop searching once target is found
            }
        }
        if (!found) {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
    public static void main(String[] args) {
        int n[] = {1, 3, 4, 66, 77, 55};
        linear(n, 66); // test case where target exists
        linear(n, 100); // test case where target does not exist
    }
}
