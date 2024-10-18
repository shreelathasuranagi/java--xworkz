//Create arrays with all primitive data types and each array will have minimum 10 values and use for loop to print from:
//  1) left to right
//  2) right to left
//  3) middle to right
//  4) middle to left
//  5) skipping 1 index


public class arrays {
    public static void main(String[] args) {
        int[] nums = {10, 20, 65, 88, 34, 67, 89, 76, 55, 28};
        float[] decimals = {12.1f, 13.4f, 56.8f, 87.4f, 99.6f, 78.4f, 45.3f, 55.2f, 34.9f, 23.6f};
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'F', 'G', 'H', 'I', 'J'};

        //Here in loops "int" is used everywhere irrespective of data type because array indices must always be integer value

        // Loop to print the integers in the nums array from left to right
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Loop to print the floats in the decimals array from left to right
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i]);
        }

        // Loop to print the characters in the alphabets array from left to right
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i]);
        }

        // Loop to print numbers from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

        // Loop to print decimals from right to left
        for (int i = decimals.length - 1; i >= 0; i--) {
            System.out.println(decimals[i]);
        }

        // Loop to print the characters in the alphabets array from right to left
        for (int i = alphabets.length - 1; i >= 0; i--) {
            System.out.println(alphabets[i]);
        }

        // Loop to print the characters in the alphabets array from middle to right
        for (int i = 5; i < alphabets.length; i++) {
            System.out.println(alphabets[i]);
        }

        // Loop to print numbers from middle to right
        for (int i = 5; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Loop to print decimals from middle to right
        for (int i = 5; i < decimals.length; i++) {
            System.out.println(decimals[i]);
        }

        // Loop to print the characters in the alphabets array from middle to left
        for (int i = 5; i >= 0; i--) {
            System.out.println(alphabets[i]);
        }

        // Loop to print numbers from middle to left
        for (int i = 5; i >= 0; i--) {
            System.out.println(nums[i]);
        }

        // Loop to print decimals from middle to left
        for (int i = 5; i >= 0; i--) {
            System.out.println(decimals[i]);
        }

        // Loop to print the characters in the alphabets array skipping one element
        for (int i = 0; i < alphabets.length; i += 2) {
            System.out.println(alphabets[i]);
        }

        // Loop to print numbers skipping one element
        for (int i = 0; i < nums.length; i += 2) {
            System.out.println(nums[i]);
        }

        // Loop to print decimals skipping one element
        for (int i = 0; i < decimals.length; i += 2) {
            System.out.println(decimals[i]);
        }
    }
}
