public class ArrayReversal {
    public static void reverseArray(int[] array) {
        int left = 0; // Start pointer
        int right = array.length - 1; // End pointer

        while (left < right) {
            // Swap the elements at the left and right pointers
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        reverseArray(array);

        System.out.println("\nReversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
