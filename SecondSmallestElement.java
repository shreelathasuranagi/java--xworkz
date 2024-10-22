//return the second smallest element


public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] marks = {76, 66, 89, 69, 80, 56};  

        int result = secondSmallestElement(marks);  

        System.out.println("The second smallest element is: " + result);
    }

    public static int secondSmallestElement(int[] arr) {
        int n = arr.length;

        // Initialize smallest and second smallest to the first two elements
        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;  // Update second smallest
                smallest = arr[i];  // Update smallest
            } 

            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];  // Update second smallest
            }
        }

        return secondSmallest;
    }
}
