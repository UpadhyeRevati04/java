
class ReverseString {
    public static String reverseString(String a)
    {
        char[] charr = a.toCharArray();
        int s = 0;
        int e = charr.length - 1;
        while(s < e)
        {
            char temp = charr[s];
            charr[s] = charr[e];
            charr[e] = temp;
            s++;
            e--;
        }
        String reversed = new String(charr);
        return reversed;
    }
    public static void main(String[] args) {
        // Example usage of the reverseString method
        String example1 = reverseString("codedamn");
        String example2 = reverseString("123");

        // Output the results
        System.out.println(example1); // Expected output: nmadedoc
        System.out.println(example2); // Expected output: 321
    }
    

    // Create "reverseString" method to reverse a string
}
