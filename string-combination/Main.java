// public class Main 
// {
//     private static void combine(char[] array, int start, StringBuilder current, int targetSum) {
//         for (int i = start; i < array.length; i++) {
//             current.append(array[i]);
//             if (sumOfDigits(current) == targetSum) {
//                 System.out.println(current.toString());
//             }
//             combine(array, i + 1, current, targetSum);
//             current.deleteCharAt(current.length() - 1);
//         }
//     }

//     private static int sumOfDigits(StringBuilder str) {
//         int sum = 0;
//         for (int i = 0; i < str.length(); i++) {
//             sum += str.charAt(i) - '0';
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         String str = "1234";
//         char[] charArray = str.toCharArray();
//         int targetSum = 6; // Set the target sum here
//         combine(charArray, 0, new StringBuilder(), targetSum);
//     }
// }

public class Main 
{
    private static void combine(char[] array, int start, StringBuilder current) {
        for (int i = start; i < array.length; i++) {
            current.append(array[i]);
            System.out.println(current.toString());
            combine(array, i + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
    public static void main(String[] args) {
        String str = "1234";
        char[] charArray = str.toCharArray();
        combine(charArray, 0, new StringBuilder());
    }
}