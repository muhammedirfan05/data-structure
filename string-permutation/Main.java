import java.util.Arrays;

public class Main
{
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static void permute(char[] array, int l, int r)
    {
        if (l == r) 
            System.out.println(new String(array));
        else {
            for (int i = l; i <= r; i++) {
                swap(array, l, i);
                permute(array, l + 1, r);
                swap(array, l, i);
            }
        }
    }
    public static void main(String[] args) 
    {
        String str = "ABC";
        char[] charArray = str.toCharArray();
        permute(charArray, 0, charArray.length - 1);
    }
}
